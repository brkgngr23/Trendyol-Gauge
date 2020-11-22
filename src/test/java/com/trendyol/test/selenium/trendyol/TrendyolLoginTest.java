package com.trendyol.test.selenium.trendyol;

import com.thoughtworks.gauge.Step;
import com.trendyol.pages.selenium.trendyol.Trendyol;
import org.testng.annotations.Test;


import java.io.IOException;

public class TrendyolLoginTest extends Trendyol {

@Test
public void Trendyol_Login() throws InterruptedException, IOException {
	startTest().login().UrunArama("bilgisayar")
	.UrunSec()
	.SepetimUrunFiyatKarsilastir()
	.SepetimUrunAdetArtir();
}
@Step({"Test Hazırlık"})
public void Trendyol_Deneme() throws InterruptedException, IOException {
	System.out.println("çalıştı");
}
}