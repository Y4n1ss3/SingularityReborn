package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextFieldCursorKt;
import androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter;
import androidx.compose.foundation.text.input.internal.CursorAnimationState;
import androidx.compose.foundation.text.input.internal.LegacyTextInputMethodRequest;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final /* synthetic */ class y4 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ y4(un unVar, my myVar, SharedPreferences sharedPreferences, ky kyVar, MutableState mutableState) {
        this.d = 9;
        this.f = unVar;
        this.g = myVar;
        this.h = sharedPreferences;
        this.e = kyVar;
        this.i = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        AnchoredDraggableState Saver$lambda$7;
        w01 startInput$lambda$0;
        b8 b8Var;
        w01 cursor$lambda$0$2$0;
        int i = this.d;
        hm hmVar = null;
        w01 w01Var = w01.a;
        Object obj2 = this.i;
        Object obj3 = this.e;
        Object obj4 = this.h;
        Object obj5 = this.g;
        Object obj6 = this.f;
        switch (i) {
            case 0:
                Saver$lambda$7 = AnchoredDraggableState.Companion.Saver$lambda$7((ky) obj3, (iy) obj5, (AnimationSpec) obj4, (DecayAnimationSpec) obj2, (ky) obj6, obj);
                break;
            case 1:
                startInput$lambda$0 = AndroidLegacyPlatformTextInputServiceAdapter.startInput$lambda$0((TextFieldValue) obj5, (AndroidLegacyPlatformTextInputServiceAdapter) obj4, (ImeOptions) obj2, (ky) obj3, (ky) obj6, (LegacyTextInputMethodRequest) obj);
                break;
            case 2:
                MutableState mutableState = (MutableState) obj6;
                SnapshotStateMap snapshotStateMap = (SnapshotStateMap) obj5;
                un unVar = (un) obj4;
                Context context = (Context) obj2;
                ky kyVar = (ky) obj3;
                Uri uri = (Uri) obj;
                if (uri != null && (b8Var = (b8) mutableState.getValue()) != null) {
                    String str = b8Var.c;
                    Object obj7 = snapshotStateMap.get(str);
                    obj7.getClass();
                    snapshotStateMap.put(str, e8.a((e8) obj7, "Starting Installation...", true, null, false, null, 28));
                    p01.t(unVar, null, null, new a3(b8Var, context, uri, kyVar, str, snapshotStateMap, null, 4), 3);
                }
                mutableState.setValue(null);
                break;
            case 3:
                MutableState mutableState2 = (MutableState) obj6;
                LazyListScope lazyListScope = (LazyListScope) obj;
                lazyListScope.getClass();
                List list = (List) mutableState2.getValue();
                lazyListScope.items(list.size(), null, new xa(list, 4), ComposableLambdaKt.composableLambdaInstance(802480018, true, new tm(list, (un) obj5, (ky) obj3, (jm) obj4, (MutableState) obj2, mutableState2)));
                break;
            case 4:
                un unVar2 = (un) obj6;
                Context context2 = (Context) obj2;
                Boolean bool = (Boolean) obj;
                r6.f((MutableState) obj5, bool, (SharedPreferences) obj3, "block_category_custom_domains", bool.booleanValue());
                if (gs.b((MutableState) obj4)) {
                    p01.t(unVar2, null, null, new e4(context2, hmVar, 11), 3);
                    break;
                }
                break;
            case 5:
                cursor$lambda$0$2$0 = TextFieldCursorKt.cursor$lambda$0$2$0((CursorAnimationState) obj3, (OffsetMapping) obj6, (TextFieldValue) obj5, (LegacyTextFieldState) obj4, (Brush) obj2, (ContentDrawScope) obj);
                break;
            case 6:
                Boolean bool2 = (Boolean) obj;
                boolean booleanValue = bool2.booleanValue();
                r6.f((MutableState) obj5, bool2, (SharedPreferences) obj3, "transition_void_enabled", booleanValue);
                nq nqVar = nr.a;
                p01.t((un) obj6, hq.d, null, new zz0(booleanValue, (my) obj4, (MutableState) obj2, null), 2);
                break;
            case 7:
                SharedPreferences sharedPreferences = (SharedPreferences) obj6;
                MutableState mutableState3 = (MutableState) obj4;
                MutableState mutableState4 = (MutableState) obj2;
                Boolean bool3 = (Boolean) obj;
                boolean booleanValue2 = bool3.booleanValue();
                r6.f(mutableState3, bool3, sharedPreferences, "gamepad_mode_toggle_enabled", booleanValue2);
                mutableState4.setValue(Boolean.TRUE);
                nq nqVar2 = nr.a;
                p01.t((un) obj5, hq.d, null, new ba(booleanValue2, (ky) obj3, sharedPreferences, mutableState4, mutableState3, null, 2), 2);
                break;
            case 8:
                Boolean bool4 = (Boolean) obj;
                boolean booleanValue3 = bool4.booleanValue();
                ((MutableState) obj4).setValue(bool4);
                ((SharedPreferences) obj6).edit().putBoolean("link_fix_running", booleanValue3).putBoolean("link_fix_on_boot", booleanValue3).apply();
                nq nqVar3 = nr.a;
                p01.t((un) obj5, hq.d, null, new z70(booleanValue3, (rw0) obj2, (ky) obj3, null, 1), 2);
                break;
            default:
                p01.t((un) obj6, null, null, new ba(((Boolean) obj).booleanValue(), (my) obj5, (SharedPreferences) obj4, (ky) obj3, (MutableState) obj2, null), 3);
                break;
        }
        return w01Var;
    }

    public /* synthetic */ y4(jm jmVar, un unVar, ky kyVar, MutableState mutableState, MutableState mutableState2) {
        this.d = 3;
        this.f = mutableState;
        this.g = unVar;
        this.e = kyVar;
        this.h = jmVar;
        this.i = mutableState2;
    }

    public /* synthetic */ y4(AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, ky kyVar, iy iyVar, ky kyVar2) {
        this.d = 0;
        this.e = kyVar;
        this.g = iyVar;
        this.h = animationSpec;
        this.i = decayAnimationSpec;
        this.f = kyVar2;
    }

    public /* synthetic */ y4(TextFieldValue textFieldValue, AndroidLegacyPlatformTextInputServiceAdapter androidLegacyPlatformTextInputServiceAdapter, ImeOptions imeOptions, ky kyVar, ky kyVar2) {
        this.d = 1;
        this.g = textFieldValue;
        this.h = androidLegacyPlatformTextInputServiceAdapter;
        this.i = imeOptions;
        this.e = kyVar;
        this.f = kyVar2;
    }

    public /* synthetic */ y4(Object obj, Object obj2, Object obj3, Object obj4, ky kyVar, int i) {
        this.d = i;
        this.f = obj;
        this.g = obj2;
        this.h = obj3;
        this.i = obj4;
        this.e = kyVar;
    }

    public /* synthetic */ y4(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
        this.i = obj5;
    }
}
