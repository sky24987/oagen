package com.test;

public class oagenNewWizardPage
{
  protected static String nl;
  public static synchronized oagenNewWizardPage create(String lineSeparator)
  {
    nl = lineSeparator;
    oagenNewWizardPage result = new oagenNewWizardPage();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = " " + NL + "Hello,";
  protected final String TEXT_2 = "! " + NL + "public class Table {" + NL + "\tyun;" + NL + "" + NL + "}";
  protected final String TEXT_3 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(argument);
    stringBuffer.append(TEXT_2);
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
