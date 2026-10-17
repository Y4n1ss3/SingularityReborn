package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3;
import androidx.compose.ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.ui.platform.PlatformTextInputSession;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeOptions;
import defpackage.bq;
import defpackage.hm;
import defpackage.iy;
import defpackage.jb0;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.p01;
import defpackage.p10;
import defpackage.q10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;
import defpackage.xn;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3", f = "AndroidTextInputSession.android.kt", l = {127}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 extends us0 implements my {
    final /* synthetic */ ComposeInputMethodManager $composeImm;
    final /* synthetic */ ImeOptions $imeOptions;
    final /* synthetic */ TextLayoutState $layoutState;
    final /* synthetic */ ky $onImeAction;
    final /* synthetic */ ReceiveContentConfiguration $receiveContentConfiguration;
    final /* synthetic */ TransformedTextFieldState $state;
    final /* synthetic */ jb0 $stylusHandwritingTrigger;
    final /* synthetic */ PlatformTextInputSession $this_platformSpecificTextInputSession;
    final /* synthetic */ iy $updateSelectionState;
    final /* synthetic */ ky $updateTouchMode;
    final /* synthetic */ ViewConfiguration $viewConfiguration;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1", f = "AndroidTextInputSession.android.kt", l = {89}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements my {
        final /* synthetic */ ComposeInputMethodManager $composeImm;
        final /* synthetic */ TransformedTextFieldState $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TransformedTextFieldState transformedTextFieldState, ComposeInputMethodManager composeInputMethodManager, hm hmVar) {
            super(2, hmVar);
            this.$state = transformedTextFieldState;
            this.$composeImm = composeInputMethodManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(ComposeInputMethodManager composeInputMethodManager, TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z) {
            long m1239getSelectiond9O1mEE = textFieldCharSequence.m1239getSelectiond9O1mEE();
            TextRange m1238getCompositionMzsxiRA = textFieldCharSequence.m1238getCompositionMzsxiRA();
            long m1239getSelectiond9O1mEE2 = textFieldCharSequence2.m1239getSelectiond9O1mEE();
            TextRange m1238getCompositionMzsxiRA2 = textFieldCharSequence2.m1238getCompositionMzsxiRA();
            if (z) {
                composeInputMethodManager.restartInput();
            } else {
                if (TextRange.m7053equalsimpl0(m1239getSelectiond9O1mEE, m1239getSelectiond9O1mEE2) && q10.b(m1238getCompositionMzsxiRA, m1238getCompositionMzsxiRA2)) {
                    return;
                }
                composeInputMethodManager.updateSelection(TextRange.m7058getMinimpl(m1239getSelectiond9O1mEE2), TextRange.m7057getMaximpl(m1239getSelectiond9O1mEE2), m1238getCompositionMzsxiRA2 != null ? TextRange.m7058getMinimpl(m1238getCompositionMzsxiRA2.m7064unboximpl()) : -1, m1238getCompositionMzsxiRA2 != null ? TextRange.m7057getMaximpl(m1238getCompositionMzsxiRA2.m7064unboximpl()) : -1);
            }
        }

        @Override // defpackage.mc
        public final hm create(Object obj, hm hmVar) {
            return new AnonymousClass1(this.$state, this.$composeImm, hmVar);
        }

        @Override // defpackage.my
        public final Object invoke(un unVar, hm hmVar) {
            return ((AnonymousClass1) create(unVar, hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                p10.Q(obj);
                TransformedTextFieldState transformedTextFieldState = this.$state;
                final ComposeInputMethodManager composeInputMethodManager = this.$composeImm;
                TextFieldState.NotifyImeListener notifyImeListener = new TextFieldState.NotifyImeListener() { // from class: androidx.compose.foundation.text.input.internal.d
                    @Override // androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener
                    public final void onChange(TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, boolean z) {
                        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3.AnonymousClass1.invokeSuspend$lambda$0(ComposeInputMethodManager.this, textFieldCharSequence, textFieldCharSequence2, z);
                    }
                };
                this.label = 1;
                Object collectImeNotifications = transformedTextFieldState.collectImeNotifications(notifyImeListener, this);
                vn vnVar = vn.d;
                if (collectImeNotifications == vnVar) {
                    return vnVar;
                }
            } else {
                if (i != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
            }
            o.j();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3(jb0 jb0Var, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, ComposeInputMethodManager composeInputMethodManager, PlatformTextInputSession platformTextInputSession, ImeOptions imeOptions, ReceiveContentConfiguration receiveContentConfiguration, ky kyVar, iy iyVar, ViewConfiguration viewConfiguration, ky kyVar2, hm hmVar) {
        super(2, hmVar);
        this.$stylusHandwritingTrigger = jb0Var;
        this.$state = transformedTextFieldState;
        this.$layoutState = textLayoutState;
        this.$composeImm = composeInputMethodManager;
        this.$this_platformSpecificTextInputSession = platformTextInputSession;
        this.$imeOptions = imeOptions;
        this.$receiveContentConfiguration = receiveContentConfiguration;
        this.$onImeAction = kyVar;
        this.$updateSelectionState = iyVar;
        this.$viewConfiguration = viewConfiguration;
        this.$updateTouchMode = kyVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputConnection invokeSuspend$lambda$1(TransformedTextFieldState transformedTextFieldState, ImeOptions imeOptions, ReceiveContentConfiguration receiveContentConfiguration, ComposeInputMethodManager composeInputMethodManager, ky kyVar, CursorAnchorInfoController cursorAnchorInfoController, TextLayoutState textLayoutState, iy iyVar, ViewConfiguration viewConfiguration, ky kyVar2, EditorInfo editorInfo) {
        AndroidTextInputSession_androidKt.logDebug$default(null, new c(transformedTextFieldState, 0), 1, null);
        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1 androidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1 = new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1(new DefaultImeEditCommandScope(transformedTextFieldState), transformedTextFieldState, composeInputMethodManager, kyVar, receiveContentConfiguration, cursorAnchorInfoController, textLayoutState, iyVar, viewConfiguration, kyVar2);
        EditorInfo_androidKt.m1279updatepLxbY9I(editorInfo, transformedTextFieldState.getVisualText(), transformedTextFieldState.getVisualText().m1239getSelectiond9O1mEE(), imeOptions, receiveContentConfiguration != null ? AndroidTextInputSession_androidKt.ALL_MIME_TYPES : null);
        return new StatelessInputConnection(androidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1, editorInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invokeSuspend$lambda$1$0(TransformedTextFieldState transformedTextFieldState) {
        return "createInputConnection(value=\"" + ((Object) transformedTextFieldState.getVisualText()) + "\")";
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 androidTextInputSession_androidKt$platformSpecificTextInputSession$3 = new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3(this.$stylusHandwritingTrigger, this.$state, this.$layoutState, this.$composeImm, this.$this_platformSpecificTextInputSession, this.$imeOptions, this.$receiveContentConfiguration, this.$onImeAction, this.$updateSelectionState, this.$viewConfiguration, this.$updateTouchMode, hmVar);
        androidTextInputSession_androidKt$platformSpecificTextInputSession$3.L$0 = obj;
        return androidTextInputSession_androidKt$platformSpecificTextInputSession$3;
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            p10.Q(obj);
            un unVar = (un) this.L$0;
            p01.t(unVar, null, xn.g, new AnonymousClass1(this.$state, this.$composeImm, null), 1);
            jb0 jb0Var = this.$stylusHandwritingTrigger;
            if (jb0Var != null) {
                p01.t(unVar, null, null, new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$2$1(jb0Var, this.$composeImm, null), 3);
            }
            final CursorAnchorInfoController cursorAnchorInfoController = new CursorAnchorInfoController(this.$state, this.$layoutState, this.$composeImm, unVar);
            PlatformTextInputSession platformTextInputSession = this.$this_platformSpecificTextInputSession;
            final TransformedTextFieldState transformedTextFieldState = this.$state;
            final ImeOptions imeOptions = this.$imeOptions;
            final ReceiveContentConfiguration receiveContentConfiguration = this.$receiveContentConfiguration;
            final ComposeInputMethodManager composeInputMethodManager = this.$composeImm;
            final ky kyVar = this.$onImeAction;
            final TextLayoutState textLayoutState = this.$layoutState;
            final iy iyVar = this.$updateSelectionState;
            final ViewConfiguration viewConfiguration = this.$viewConfiguration;
            final ky kyVar2 = this.$updateTouchMode;
            PlatformTextInputMethodRequest platformTextInputMethodRequest = new PlatformTextInputMethodRequest() { // from class: androidx.compose.foundation.text.input.internal.b
                @Override // androidx.compose.ui.platform.PlatformTextInputMethodRequest
                public final InputConnection createInputConnection(EditorInfo editorInfo) {
                    InputConnection invokeSuspend$lambda$1;
                    invokeSuspend$lambda$1 = AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3.invokeSuspend$lambda$1(TransformedTextFieldState.this, imeOptions, receiveContentConfiguration, composeInputMethodManager, kyVar, cursorAnchorInfoController, textLayoutState, iyVar, viewConfiguration, kyVar2, editorInfo);
                    return invokeSuspend$lambda$1;
                }
            };
            this.label = 1;
            Object startInputMethod = platformTextInputSession.startInputMethod(platformTextInputMethodRequest, this);
            vn vnVar = vn.d;
            if (startInputMethod == vnVar) {
                return vnVar;
            }
        } else {
            if (i != 1) {
                o.f("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            p10.Q(obj);
        }
        o.j();
        return null;
    }
}
