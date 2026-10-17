package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.handwriting.StylusHandwriting_androidKt;
import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import defpackage.bp0;
import defpackage.jb0;
import defpackage.ky;
import defpackage.mf;
import defpackage.p01;
import defpackage.w01;
import defpackage.y4;
import defpackage.z10;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AndroidLegacyPlatformTextInputServiceAdapter extends LegacyPlatformTextInputServiceAdapter {
    public static final int $stable = 8;
    private jb0 backingStylusHandwritingTrigger;
    private LegacyTextInputMethodRequest currentRequest;
    private z10 job;

    /* JADX INFO: Access modifiers changed from: private */
    public final jb0 getStylusHandwritingTrigger() {
        jb0 jb0Var = this.backingStylusHandwritingTrigger;
        if (jb0Var != null) {
            return jb0Var;
        }
        if (!StylusHandwriting_androidKt.isStylusHandwritingSupported()) {
            return null;
        }
        bp0 a = p01.a(2, mf.f);
        this.backingStylusHandwritingTrigger = a;
        return a;
    }

    private final void startInput(ky kyVar) {
        LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode textInputModifierNode = getTextInputModifierNode();
        if (textInputModifierNode == null) {
            return;
        }
        this.job = textInputModifierNode.launchTextInputSession(new AndroidLegacyPlatformTextInputServiceAdapter$startInput$2(kyVar, this, textInputModifierNode, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 startInput$lambda$0(TextFieldValue textFieldValue, AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, ImeOptions imeOptions, ky kyVar, ky kyVar2, LegacyTextInputMethodRequest legacyTextInputMethodRequest) {
        legacyTextInputMethodRequest.startInput(textFieldValue, androidLegacyPlatformTextInputServiceAdapter.getTextInputModifierNode(), imeOptions, kyVar, kyVar2);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startInput$localToScreen(LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode, float[] fArr) {
        LayoutCoordinates layoutCoordinates = legacyPlatformTextInputNode.getLayoutCoordinates();
        if (layoutCoordinates != null) {
            if (!layoutCoordinates.isAttached()) {
                layoutCoordinates = null;
            }
            if (layoutCoordinates == null) {
                return;
            }
            layoutCoordinates.mo6250transformToScreen58bKbWc(fArr);
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void notifyFocusedRect(Rect rect) {
        LegacyTextInputMethodRequest legacyTextInputMethodRequest = this.currentRequest;
        if (legacyTextInputMethodRequest != null) {
            legacyTextInputMethodRequest.notifyFocusedRect(rect);
        }
    }

    @Override // androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter
    public void startStylusHandwriting() {
        jb0 stylusHandwritingTrigger = getStylusHandwritingTrigger();
        if (stylusHandwritingTrigger != null) {
            stylusHandwritingTrigger.b(w01.a);
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void stopInput() {
        z10 z10Var = this.job;
        if (z10Var != null) {
            z10Var.cancel(null);
        }
        this.job = null;
        jb0 stylusHandwritingTrigger = getStylusHandwritingTrigger();
        if (stylusHandwritingTrigger != null) {
            stylusHandwritingTrigger.a();
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        LegacyTextInputMethodRequest legacyTextInputMethodRequest = this.currentRequest;
        if (legacyTextInputMethodRequest != null) {
            legacyTextInputMethodRequest.updateState(textFieldValue, textFieldValue2);
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResult textLayoutResult, ky kyVar, Rect rect, Rect rect2) {
        LegacyTextInputMethodRequest legacyTextInputMethodRequest = this.currentRequest;
        if (legacyTextInputMethodRequest != null) {
            legacyTextInputMethodRequest.updateTextLayoutResult(textFieldValue, offsetMapping, textLayoutResult, rect, rect2);
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput() {
        startInput(null);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public void startInput(TextFieldValue textFieldValue, ImeOptions imeOptions, ky kyVar, ky kyVar2) {
        startInput(new y4(textFieldValue, this, imeOptions, kyVar, kyVar2));
    }
}
