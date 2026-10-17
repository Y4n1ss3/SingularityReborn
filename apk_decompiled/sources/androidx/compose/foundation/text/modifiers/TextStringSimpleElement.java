package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import defpackage.dq;
import defpackage.kp0;
import defpackage.q10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends ModifierNodeElement<TextStringSimpleNode> {
    public static final int $stable = 0;
    private final ColorProducer color;
    private final FontFamily.Resolver fontFamilyResolver;
    private final int maxLines;
    private final int minLines;
    private final int overflow;
    private final boolean softWrap;
    private final TextStyle style;
    private final String text;

    public /* synthetic */ TextStringSimpleElement(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, ColorProducer colorProducer, int i4, dq dqVar) {
        this(str, textStyle, resolver, (i4 & 8) != 0 ? TextOverflow.Companion.m7546getClipgIe3tQ8() : i, (i4 & 16) != 0 ? true : z, (i4 & 32) != 0 ? Integer.MAX_VALUE : i2, (i4 & 64) != 0 ? 1 : i3, (i4 & Fields.SpotShadowColor) != 0 ? null : colorProducer, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TextStringSimpleNode create() {
        return new TextStringSimpleNode(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.color, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return q10.b(this.color, textStringSimpleElement.color) && q10.b(this.text, textStringSimpleElement.text) && q10.b(this.style, textStringSimpleElement.style) && q10.b(this.fontFamilyResolver, textStringSimpleElement.fontFamilyResolver) && TextOverflow.m7537equalsimpl0(this.overflow, textStringSimpleElement.overflow) && this.softWrap == textStringSimpleElement.softWrap && this.maxLines == textStringSimpleElement.maxLines && this.minLines == textStringSimpleElement.minLines;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int c = (((kp0.c((TextOverflow.m7538hashCodeimpl(this.overflow) + ((this.fontFamilyResolver.hashCode() + kp0.b(this.text.hashCode() * 31, 31, this.style)) * 31)) * 31, 31, this.softWrap) + this.maxLines) * 31) + this.minLines) * 31;
        ColorProducer colorProducer = this.color;
        return c + (colorProducer != null ? colorProducer.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(TextStringSimpleNode textStringSimpleNode) {
        textStringSimpleNode.doInvalidations(textStringSimpleNode.updateDraw(this.color, this.style), textStringSimpleNode.updateText(this.text), textStringSimpleNode.m1477updateLayoutRelatedArgsHuAbxIM(this.style, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    private TextStringSimpleElement(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, ColorProducer colorProducer) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        this.color = colorProducer;
    }

    public /* synthetic */ TextStringSimpleElement(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, ColorProducer colorProducer, dq dqVar) {
        this(str, textStyle, resolver, i, z, i2, i3, colorProducer);
    }
}
