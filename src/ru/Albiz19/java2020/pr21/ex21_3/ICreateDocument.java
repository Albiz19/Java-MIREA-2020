package ru.Albiz19.java2020.pr21.ex21_3;

public class ICreateDocument implements IDocument{
    public IDocument CreateNew(){
        IDocument document = new IDocument() {
            @Override
            public String toString() {
                return super.toString();
            }
        };
        new TextDocument();
        return document;
    }
    public IDocument CreateOpen(){
        IDocument document = new IDocument() {
            @Override
            public String toString() {
                return super.toString();
            }
        };
        new TextDocument();
        return document;
    }
}
