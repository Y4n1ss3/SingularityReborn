package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.TextInputService;
import defpackage.bq;
import defpackage.hm;
import defpackage.iw;
import defpackage.iy;
import defpackage.jw;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1", f = "CoreTextField.kt", l = {367}, m = "invokeSuspend", v = 1)
/* loaded from: classes.dex */
public final class CoreTextFieldKt$CoreTextField$5$1 extends us0 implements my {
    final /* synthetic */ ImeOptions $imeOptions;
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ LegacyTextFieldState $state;
    final /* synthetic */ TextInputService $textInputService;
    final /* synthetic */ State<Boolean> $writeable$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$5$1(LegacyTextFieldState legacyTextFieldState, State<Boolean> state, TextInputService textInputService, TextFieldSelectionManager textFieldSelectionManager, ImeOptions imeOptions, hm hmVar) {
        super(2, hmVar);
        this.$state = legacyTextFieldState;
        this.$writeable$delegate = state;
        this.$textInputService = textInputService;
        this.$manager = textFieldSelectionManager;
        this.$imeOptions = imeOptions;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new CoreTextFieldKt$CoreTextField$5$1(this.$state, this.$writeable$delegate, this.$textInputService, this.$manager, this.$imeOptions, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((CoreTextFieldKt$CoreTextField$5$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, w01] */
    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                p10.Q(obj);
                final State<Boolean> state = this.$writeable$delegate;
                iw snapshotFlow = SnapshotStateKt.snapshotFlow(new iy() { // from class: androidx.compose.foundation.text.d
                    @Override // defpackage.iy
                    public final Object invoke() {
                        boolean access$CoreTextField$lambda$14;
                        access$CoreTextField$lambda$14 = CoreTextFieldKt.access$CoreTextField$lambda$14(State.this);
                        return Boolean.valueOf(access$CoreTextField$lambda$14);
                    }
                });
                final LegacyTextFieldState legacyTextFieldState = this.$state;
                final TextInputService textInputService = this.$textInputService;
                final TextFieldSelectionManager textFieldSelectionManager = this.$manager;
                final ImeOptions imeOptions = this.$imeOptions;
                jw jwVar = new jw() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$5$1.2
                    public final Object emit(boolean z, hm hmVar) {
                        if (z && LegacyTextFieldState.this.getHasFocus()) {
                            CoreTextFieldKt.startInputSession(textInputService, LegacyTextFieldState.this, textFieldSelectionManager.getValue$foundation(), imeOptions, textFieldSelectionManager.getOffsetMapping$foundation());
                        } else {
                            CoreTextFieldKt.endInputSession(LegacyTextFieldState.this);
                        }
                        return w01.a;
                    }

                    @Override // defpackage.jw
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, hm hmVar) {
                        return emit(((Boolean) obj2).booleanValue(), hmVar);
                    }
                };
                this.label = 1;
                Object collect = snapshotFlow.collect(jwVar, this);
                vn vnVar = vn.d;
                if (collect == vnVar) {
                    return vnVar;
                }
            } else {
                if (i != 1) {
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
            }
            CoreTextFieldKt.endInputSession(this.$state);
            this = w01.a;
            return this;
        } catch (Throwable th) {
            CoreTextFieldKt.endInputSession(this.$state);
            throw th;
        }
    }
}
