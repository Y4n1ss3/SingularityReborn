package androidx.compose.ui.text;

import android.text.Editable;
import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class AnnotationContentHandler implements ContentHandler {
    private int bulletIndentation;
    private final ContentHandler contentHandler;
    private BulletSpanWithLevel currentBulletSpan;
    private final Editable output;

    public AnnotationContentHandler(ContentHandler contentHandler, Editable editable) {
        this.contentHandler = contentHandler;
        this.output = editable;
    }

    private final void commitCurrentBulletSpan() {
        BulletSpanWithLevel bulletSpanWithLevel = this.currentBulletSpan;
        if (bulletSpanWithLevel != null) {
            this.output.setSpan(bulletSpanWithLevel, bulletSpanWithLevel.getStart(), this.output.length(), 33);
        }
        this.currentBulletSpan = null;
    }

    private final void handleAnnotationEnd() {
        Editable editable = this.output;
        Object[] spans = editable.getSpans(0, editable.length(), AnnotationSpan.class);
        ArrayList arrayList = new ArrayList();
        for (Object obj : spans) {
            if (this.output.getSpanFlags((AnnotationSpan) obj) == 17) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AnnotationSpan annotationSpan = (AnnotationSpan) arrayList.get(i);
            int spanStart = this.output.getSpanStart(annotationSpan);
            int length = this.output.length();
            this.output.removeSpan(annotationSpan);
            if (spanStart != length) {
                this.output.setSpan(annotationSpan, spanStart, length, 33);
            }
        }
    }

    private final void handleAnnotationStart(Attributes attributes) {
        int length = attributes.getLength();
        for (int i = 0; i < length; i++) {
            String localName = attributes.getLocalName(i);
            if (localName == null) {
                localName = "";
            }
            String value = attributes.getValue(i);
            String str = value != null ? value : "";
            if (localName.length() > 0 && str.length() > 0) {
                int length2 = this.output.length();
                this.output.setSpan(new AnnotationSpan(localName, str), length2, length2, 17);
            }
        }
    }

    private final void handleLiEnd() {
        commitCurrentBulletSpan();
    }

    private final void handleLiStart() {
        commitCurrentBulletSpan();
        this.currentBulletSpan = new BulletSpanWithLevel(Bullet.Companion.getDefault(), this.bulletIndentation, this.output.length());
    }

    private final void handleUlEnd() {
        commitCurrentBulletSpan();
        this.bulletIndentation--;
    }

    private final void handleUlStart() {
        commitCurrentBulletSpan();
        this.bulletIndentation++;
    }

    @Override // org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i, int i2) {
        this.contentHandler.characters(cArr, i, i2);
    }

    @Override // org.xml.sax.ContentHandler
    public void endDocument() {
        this.contentHandler.endDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public void endElement(String str, String str2, String str3) {
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode != -1555043537) {
                if (hashCode != 3453) {
                    if (hashCode == 3735 && str2.equals("ul")) {
                        handleUlEnd();
                        return;
                    }
                } else if (str2.equals("li")) {
                    handleLiEnd();
                    return;
                }
            } else if (str2.equals("annotation")) {
                handleAnnotationEnd();
                return;
            }
        }
        this.contentHandler.endElement(str, str2, str3);
    }

    @Override // org.xml.sax.ContentHandler
    public void endPrefixMapping(String str) {
        this.contentHandler.endPrefixMapping(str);
    }

    @Override // org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i, int i2) {
        this.contentHandler.ignorableWhitespace(cArr, i, i2);
    }

    @Override // org.xml.sax.ContentHandler
    public void processingInstruction(String str, String str2) {
        this.contentHandler.processingInstruction(str, str2);
    }

    @Override // org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
        this.contentHandler.setDocumentLocator(locator);
    }

    @Override // org.xml.sax.ContentHandler
    public void skippedEntity(String str) {
        this.contentHandler.skippedEntity(str);
    }

    @Override // org.xml.sax.ContentHandler
    public void startDocument() {
        this.contentHandler.startDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public void startElement(String str, String str2, String str3, Attributes attributes) {
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode != -1555043537) {
                if (hashCode != 3453) {
                    if (hashCode == 3735 && str2.equals("ul")) {
                        handleUlStart();
                        return;
                    }
                } else if (str2.equals("li")) {
                    handleLiStart();
                    return;
                }
            } else if (str2.equals("annotation")) {
                if (attributes != null) {
                    handleAnnotationStart(attributes);
                    return;
                }
                return;
            }
        }
        this.contentHandler.startElement(str, str2, str3, attributes);
    }

    @Override // org.xml.sax.ContentHandler
    public void startPrefixMapping(String str, String str2) {
        this.contentHandler.startPrefixMapping(str, str2);
    }
}
