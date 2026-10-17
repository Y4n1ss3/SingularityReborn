package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextAutoSize;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import defpackage.dq;
import defpackage.kp0;
import defpackage.ky;
import defpackage.q10;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextAnnotatedStringElement extends ModifierNodeElement<TextAnnotatedStringNode> {
    public static final int $stable = 0;
    private final TextAutoSize autoSize;
    private final ColorProducer color;
    private final FontFamily.Resolver fontFamilyResolver;
    private final int maxLines;
    private final int minLines;
    private final ky onPlaceholderLayout;
    private final ky onShowTranslation;
    private final ky onTextLayout;
    private final int overflow;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final SelectionController selectionController;
    private final boolean softWrap;
    private final TextStyle style;
    private final AnnotatedString text;

    public /* synthetic */ TextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, ky kyVar, int i, boolean z, int i2, int i3, List list, ky kyVar2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, ky kyVar3, int i4, dq dqVar) {
        this(annotatedString, textStyle, resolver, (i4 & 8) != 0 ? null : kyVar, (i4 & 16) != 0 ? TextOverflow.Companion.m7546getClipgIe3tQ8() : i, (i4 & 32) != 0 ? true : z, (i4 & 64) != 0 ? Integer.MAX_VALUE : i2, (i4 & Fields.SpotShadowColor) != 0 ? 1 : i3, (i4 & Fields.RotationX) != 0 ? null : list, (i4 & Fields.RotationY) != 0 ? null : kyVar2, (i4 & Fields.RotationZ) != 0 ? null : selectionController, (i4 & Fields.CameraDistance) != 0 ? null : colorProducer, (i4 & Fields.TransformOrigin) != 0 ? null : textAutoSize, (i4 & 8192) != 0 ? null : kyVar3, null);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public TextAnnotatedStringNode create() {
        return new TextAnnotatedStringNode(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, this.autoSize, this.onShowTranslation, null);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return q10.b(this.color, textAnnotatedStringElement.color) && q10.b(this.text, textAnnotatedStringElement.text) && q10.b(this.style, textAnnotatedStringElement.style) && q10.b(this.placeholders, textAnnotatedStringElement.placeholders) && q10.b(this.fontFamilyResolver, textAnnotatedStringElement.fontFamilyResolver) && this.onTextLayout == textAnnotatedStringElement.onTextLayout && this.onShowTranslation == textAnnotatedStringElement.onShowTranslation && TextOverflow.m7537equalsimpl0(this.overflow, textAnnotatedStringElement.overflow) && this.softWrap == textAnnotatedStringElement.softWrap && this.maxLines == textAnnotatedStringElement.maxLines && this.minLines == textAnnotatedStringElement.minLines && this.onPlaceholderLayout == textAnnotatedStringElement.onPlaceholderLayout && q10.b(this.selectionController, textAnnotatedStringElement.selectionController);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        int hashCode = (this.fontFamilyResolver.hashCode() + kp0.b(this.text.hashCode() * 31, 31, this.style)) * 31;
        ky kyVar = this.onTextLayout;
        int c = (((kp0.c((TextOverflow.m7538hashCodeimpl(this.overflow) + ((hashCode + (kyVar != null ? kyVar.hashCode() : 0)) * 31)) * 31, 31, this.softWrap) + this.maxLines) * 31) + this.minLines) * 31;
        List<AnnotatedString.Range<Placeholder>> list = this.placeholders;
        int hashCode2 = (c + (list != null ? list.hashCode() : 0)) * 31;
        ky kyVar2 = this.onPlaceholderLayout;
        int hashCode3 = (hashCode2 + (kyVar2 != null ? kyVar2.hashCode() : 0)) * 31;
        SelectionController selectionController = this.selectionController;
        int hashCode4 = (hashCode3 + (selectionController != null ? selectionController.hashCode() : 0)) * 31;
        ColorProducer colorProducer = this.color;
        int hashCode5 = (hashCode4 + (colorProducer != null ? colorProducer.hashCode() : 0)) * 31;
        ky kyVar3 = this.onShowTranslation;
        return hashCode5 + (kyVar3 != null ? kyVar3.hashCode() : 0);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(TextAnnotatedStringNode textAnnotatedStringNode) {
        textAnnotatedStringNode.doInvalidations(textAnnotatedStringNode.updateDraw(this.color, this.style), textAnnotatedStringNode.updateText$foundation(this.text), textAnnotatedStringNode.m1476updateLayoutRelatedArgsy0kMQk(this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow, this.autoSize), textAnnotatedStringNode.updateCallbacks(this.onTextLayout, this.onPlaceholderLayout, this.selectionController, this.onShowTranslation));
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    private TextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, ky kyVar, int i, boolean z, int i2, int i3, List<AnnotatedString.Range<Placeholder>> list, ky kyVar2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, ky kyVar3) {
        this.text = annotatedString;
        this.style = textStyle;
        this.fontFamilyResolver = resolver;
        this.onTextLayout = kyVar;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        this.placeholders = list;
        this.onPlaceholderLayout = kyVar2;
        this.selectionController = selectionController;
        this.color = colorProducer;
        this.autoSize = textAutoSize;
        this.onShowTranslation = kyVar3;
    }

    public /* synthetic */ TextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, ky kyVar, int i, boolean z, int i2, int i3, List list, ky kyVar2, SelectionController selectionController, ColorProducer colorProducer, TextAutoSize textAutoSize, ky kyVar3, dq dqVar) {
        this(annotatedString, textStyle, resolver, kyVar, i, z, i2, i3, list, kyVar2, selectionController, colorProducer, textAutoSize, kyVar3);
    }
}
