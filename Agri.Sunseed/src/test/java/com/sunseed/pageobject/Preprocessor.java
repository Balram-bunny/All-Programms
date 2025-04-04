package com.sunseed.pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Preprocessor {
	WebDriver ldriver;
	public Preprocessor(WebDriver rdriver )
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	// 1.APV Radio button
    @FindBy (xpath="//input[@value='APV']")
    WebElement APVradio;
    // only agri Radio button
        @FindBy (xpath="//input[@value='Only Agri']")
        WebElement onlyagriradio;
        // PV Radio button
        @FindBy (xpath="//input[@value='Only PV']")
        WebElement OnlyPVradio;
    //2.PV module
    @FindBy (xpath="(//div[@id='demo-simple-select'])[1]")
    WebElement PVmodule;
    //2.PV module options
    @FindBy (xpath="//li[@role='option']")
    List<WebElement> PVmoduleoptions;
    
    //3.mode of PV operation
    @FindBy (xpath="(//div[@id='demo-simple-select'])[2]")
    WebElement PVoperation;
    //3.OPtions of PV Operation
    @FindBy (xpath="//li[@role='option']")
    List<WebElement> PVOperation1;
    
    //4.module configuration
        @FindBy (xpath="(//div[@id='demo-simple-select'])[3]")
        WebElement moduleconfiguration;
        //4.Options
        @FindBy (xpath="//li[@role='option']")
        List<WebElement> moduleconfiguration1;
        //5.Find soil type
        @FindBy (xpath="//div[@id='demo-simple-select'][4]")
        WebElement SoilType;
        //5. soil type options
        @FindBy (xpath="//li[@role='option']")
        List<WebElement> SoilTypeOptions;
        
    //Tilt ft
    @FindBy (name="tiltIfFt")
    WebElement tiltangle;
    
    //module mask pattern
    @FindBy (xpath="//div[@id='demo-simple-select'][5]")
    WebElement ModuleMaskPattern;
    
    //5. module mask pattern options
    @FindBy (xpath="//li[@role='option']")
    List<WebElement> ModuleMaskPatternOptions;
    //gap between modules
    @FindBy (name="gapBetweenModules")
    WebElement gapmodules;
    //height
    @FindBy (name="height")
    WebElement height;
    //pitch of rows
    @FindBy (name="pitchOfRow")
    WebElement pitchrows;
    //azimuth
    @FindBy (name="azimuth")
    WebElement azimuth;
    //length of one row
    @FindBy (name="lengthOfOneRow")
    WebElement lengthofonerow;
    
    //save & next
    @FindBy (xpath="//button[@type='submit']")
    WebElement savenext;
    
    public void clickonAPV()
    {
        APVradio.click();
    }
    public void clickonOnlyAgri()
    {
        onlyagriradio.click();
    }
    public void clickonPV()
    {
        OnlyPVradio.click();
    }
    public void PVmodule()
    {
		

        PVmodule.click();
        for(int i=0;i<PVmoduleoptions.size();i++)
        {
            String str=PVmoduleoptions.get(i).getText();
            if(str.equalsIgnoreCase("pdc0_690.0_HYPERSOL VSMDH.66.AAA.05"))
            {
                PVmoduleoptions.get(i).click();
            }
        }
        
    }
    
    public void PVoperation()
    {
        PVoperation.click();
        for(int i=0;i<PVOperation1.size();i++)
        {
            String str=PVOperation1.get(i).getText();
            if(str.equalsIgnoreCase("fixed tilt"))
            {
                PVOperation1.get(i).click();
            }
        }
    }
    
    public void moduleconfig()
    {
        moduleconfiguration.click();
        for(int i=0;i<moduleconfiguration1.size();i++)
        {
            String str=moduleconfiguration1.get(i).getText();
            if(str.equalsIgnoreCase("2P"))
            {
                moduleconfiguration1.get(i).click();
            }
        }
    }
    public void SoilType()
    {
    	SoilType.click();
        for(int i=0;i<SoilTypeOptions.size();i++)
        {
            String str=SoilTypeOptions.get(i).getText();
            if(str.equalsIgnoreCase("Brown Sandy Loam Soil"))
            {
            	SoilTypeOptions.get(i).click();
            }
        }
    }
    
    
    
    public void ModuleMaskPattern()
    {
    	ModuleMaskPattern.click();
         for(int i=0;i<ModuleMaskPatternOptions.size();i++)
         {
             String str=ModuleMaskPatternOptions.get(i).getText();
             if(str.equalsIgnoreCase("110"))
             {
            	 ModuleMaskPatternOptions.get(i).click();
             }
         }
    }
    public void tiltangle(String str1)
    {
        tiltangle.sendKeys(str1);
    }
    public void Height(String str2)
    {
        height.sendKeys(str2);
    }
    public void Lengthonerow(String str3)
    {
        lengthofonerow.sendKeys(str3);
    }
    public void gapbetweenmodules(String str4)
    {
        gapmodules.sendKeys(str4);
    }
    public void pitchofrows(String str5)
    {
        pitchrows.sendKeys(str5);
    }
    public void azimuth(String str)
    {
        azimuth.sendKeys(str);
    }
    public void Savenext()
    {
        savenext.click();
    }
}
