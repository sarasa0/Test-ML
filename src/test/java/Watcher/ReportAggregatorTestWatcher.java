package Watcher;

import Driver.DriverManager;
import Utils.Log;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReportAggregatorTestWatcher extends TestWatcher {
    private static String resultLog = "";

    public ReportAggregatorTestWatcher() {
    }

    @Override
    protected void succeeded(Description description) {
        super.succeeded(description);
        resultLog = "TEST :: SUCCEDED :: " + description.getMethodName();
        Log.info(resultLog);
    }

    @Override
    protected void failed(Throwable e, Description description) {
        super.failed(e, description);
        resultLog = "TEST :: FAILED :: " + description.getMethodName();
        Log.info(resultLog);
    }

    @Override
    protected void starting(Description description) {
        resultLog = "TEST :: STARTING :: " + description.getMethodName();
        Log.info(resultLog);
        super.starting(description);
    }

    @Override
    protected void finished(Description description) {
        super.finished(description);
    }

    public void takeScreenShot() {
        try {
            int cont = 0;
            Files.createDirectories(Paths.get("error"));
            cont = (int) Files.list(Paths.get("error")).count();
            File src = ((TakesScreenshot) DriverManager.getDriverInstance()).getScreenshotAs(OutputType.FILE);
            File dest = new File("error/errorTest" + cont + ".png ");
            Files.copy(src.toPath(), dest.toPath());
        } catch (IOException e) {
            Log.exception("Ocurrio un error generando directorios necesarios", e);
        }
    }
}
