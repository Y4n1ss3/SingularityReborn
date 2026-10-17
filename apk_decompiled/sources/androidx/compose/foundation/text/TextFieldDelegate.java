package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.dq;
import defpackage.f1;
import defpackage.hm0;
import defpackage.ji0;
import defpackage.kw0;
import defpackage.ky;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldDelegate {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        /* renamed from: drawHighlight-Le-punE, reason: not valid java name */
        private final void m1176drawHighlightLepunE(Canvas canvas, long j, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Paint paint) {
            int originalToTransformed = offsetMapping.originalToTransformed(TextRange.m7058getMinimpl(j));
            int originalToTransformed2 = offsetMapping.originalToTransformed(TextRange.m7057getMaximpl(j));
            if (originalToTransformed != originalToTransformed2) {
                canvas.drawPath(textLayoutResult.getPathForRange(originalToTransformed, originalToTransformed2), paint);
            }
        }

        /* renamed from: layout-_EkL_-Y$foundation$default, reason: not valid java name */
        public static /* synthetic */ kw0 m1177layout_EkL_Y$foundation$default(Companion companion, TextDelegate textDelegate, long j, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult, int i, Object obj) {
            if ((i & 8) != 0) {
                textLayoutResult = null;
            }
            return companion.m1180layout_EkL_Y$foundation(textDelegate, j, layoutDirection, textLayoutResult);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final IntSize notifyFocusedRect$lambda$0(TextDelegate textDelegate) {
            return IntSize.m7774boximpl(TextFieldDelegateKt.computeSizeForDefaultText$default(textDelegate.getStyle(), textDelegate.getDensity(), textDelegate.getFontFamilyResolver(), null, 0, 24, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w01 restartInput$lambda$0(EditProcessor editProcessor, ky kyVar, ji0 ji0Var, List list) {
            TextFieldDelegate.Companion.onEditCommand$foundation(list, editProcessor, kyVar, (TextInputSession) ji0Var.d);
            return w01.a;
        }

        /* renamed from: applyCompositionDecoration-72CqOWE, reason: not valid java name */
        public final TransformedText m1178applyCompositionDecoration72CqOWE(long j, TransformedText transformedText) {
            int originalToTransformed = transformedText.getOffsetMapping().originalToTransformed(TextRange.m7060getStartimpl(j));
            int originalToTransformed2 = transformedText.getOffsetMapping().originalToTransformed(TextRange.m7055getEndimpl(j));
            int min = Math.min(originalToTransformed, originalToTransformed2);
            int max = Math.max(originalToTransformed, originalToTransformed2);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(transformedText.getText());
            builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Companion.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (dq) null), min, max);
            return new TransformedText(builder.toAnnotatedString(), transformedText.getOffsetMapping());
        }

        /* renamed from: draw-Q1vqE60$foundation, reason: not valid java name */
        public final void m1179drawQ1vqE60$foundation(Canvas canvas, TextFieldValue textFieldValue, long j, long j2, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, Paint paint, long j3) {
            if (!TextRange.m7054getCollapsedimpl(j)) {
                paint.mo4637setColor8_81llA(j3);
                m1176drawHighlightLepunE(canvas, j, offsetMapping, textLayoutResult, paint);
            } else if (!TextRange.m7054getCollapsedimpl(j2)) {
                Color m4751boximpl = Color.m4751boximpl(textLayoutResult.getLayoutInput().getStyle().m7090getColor0d7_KjU());
                if (m4751boximpl.m4771unboximpl() == 16) {
                    m4751boximpl = null;
                }
                long m4771unboximpl = m4751boximpl != null ? m4751boximpl.m4771unboximpl() : Color.Companion.m4787getBlack0d7_KjU();
                paint.mo4637setColor8_81llA(Color.m4760copywmQWz5c$default(m4771unboximpl, Color.m4763getAlphaimpl(m4771unboximpl) * 0.2f, 0.0f, 0.0f, 0.0f, 14, null));
                m1176drawHighlightLepunE(canvas, j2, offsetMapping, textLayoutResult, paint);
            } else if (!TextRange.m7054getCollapsedimpl(textFieldValue.m7310getSelectiond9O1mEE())) {
                paint.mo4637setColor8_81llA(j3);
                m1176drawHighlightLepunE(canvas, textFieldValue.m7310getSelectiond9O1mEE(), offsetMapping, textLayoutResult, paint);
            }
            TextPainter.INSTANCE.paint(canvas, textLayoutResult);
        }

        /* renamed from: layout-_EkL_-Y$foundation, reason: not valid java name */
        public final kw0 m1180layout_EkL_Y$foundation(TextDelegate textDelegate, long j, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult) {
            TextLayoutResult m1167layoutNN6EwU = textDelegate.m1167layoutNN6EwU(j, layoutDirection, textLayoutResult);
            return new kw0(Integer.valueOf((int) (m1167layoutNN6EwU.m7031getSizeYbymL2g() >> 32)), Integer.valueOf((int) (m1167layoutNN6EwU.m7031getSizeYbymL2g() & 4294967295L)), m1167layoutNN6EwU);
        }

        public final void notifyFocusedRect$foundation(TextFieldValue textFieldValue, TextDelegate textDelegate, TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, TextInputSession textInputSession, boolean z, OffsetMapping offsetMapping) {
            if (z) {
                textInputSession.notifyFocusedRect(TextFieldDelegateKt.focusedRectInRoot(textLayoutResult, layoutCoordinates, offsetMapping.originalToTransformed(TextRange.m7057getMaximpl(textFieldValue.m7310getSelectiond9O1mEE())), new hm0(textDelegate, 13)));
            }
        }

        public final void onBlur$foundation(TextInputSession textInputSession, EditProcessor editProcessor, ky kyVar) {
            kyVar.invoke(TextFieldValue.m7305copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (AnnotatedString) null, 0L, (TextRange) null, 3, (Object) null));
            textInputSession.dispose();
        }

        public final void onEditCommand$foundation(List<? extends EditCommand> list, EditProcessor editProcessor, ky kyVar, TextInputSession textInputSession) {
            TextFieldValue apply = editProcessor.apply(list);
            if (textInputSession != null) {
                textInputSession.updateState(null, apply);
            }
            kyVar.invoke(apply);
        }

        public final TextInputSession onFocus$foundation(TextInputService textInputService, TextFieldValue textFieldValue, EditProcessor editProcessor, ImeOptions imeOptions, ky kyVar, ky kyVar2) {
            return restartInput$foundation(textInputService, textFieldValue, editProcessor, imeOptions, kyVar, kyVar2);
        }

        public final TextInputSession restartInput$foundation(TextInputService textInputService, TextFieldValue textFieldValue, EditProcessor editProcessor, ImeOptions imeOptions, ky kyVar, ky kyVar2) {
            ji0 ji0Var = new ji0();
            TextInputSession startInput = textInputService.startInput(textFieldValue, imeOptions, new f1(editProcessor, kyVar, ji0Var, 20), kyVar2);
            ji0Var.d = startInput;
            return startInput;
        }

        /* renamed from: setCursorOffset-ULxng0E$foundation, reason: not valid java name */
        public final void m1181setCursorOffsetULxng0E$foundation(long j, TextLayoutResultProxy textLayoutResultProxy, EditProcessor editProcessor, OffsetMapping offsetMapping, ky kyVar) {
            kyVar.invoke(TextFieldValue.m7305copy3r_uNRQ$default(editProcessor.toTextFieldValue(), (AnnotatedString) null, TextRangeKt.TextRange(offsetMapping.transformedToOriginal(TextLayoutResultProxy.m1201getOffsetForPosition3MmeM6k$default(textLayoutResultProxy, j, false, 2, null))), (TextRange) null, 5, (Object) null));
        }

        public final void updateTextLayoutResult$foundation(TextInputSession textInputSession, TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResultProxy textLayoutResultProxy) {
            LayoutCoordinates decorationBoxCoordinates;
            final LayoutCoordinates innerTextFieldCoordinates = textLayoutResultProxy.getInnerTextFieldCoordinates();
            if (innerTextFieldCoordinates == null || !innerTextFieldCoordinates.isAttached() || (decorationBoxCoordinates = textLayoutResultProxy.getDecorationBoxCoordinates()) == null) {
                return;
            }
            textInputSession.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResultProxy.getValue(), new ky() { // from class: androidx.compose.foundation.text.TextFieldDelegate$Companion$updateTextLayoutResult$1$1$1
                @Override // defpackage.ky
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m1182invoke58bKbWc(((Matrix) obj).m5028unboximpl());
                    return w01.a;
                }

                /* renamed from: invoke-58bKbWc, reason: not valid java name */
                public final void m1182invoke58bKbWc(float[] fArr) {
                    if (LayoutCoordinates.this.isAttached()) {
                        LayoutCoordinatesKt.findRootCoordinates(LayoutCoordinates.this).mo6249transformFromEL8BTi8(LayoutCoordinates.this, fArr);
                    }
                }
            }, SelectionManagerKt.visibleBounds(innerTextFieldCoordinates), innerTextFieldCoordinates.localBoundingBoxOf(decorationBoxCoordinates, false));
        }

        private Companion() {
        }
    }
}
