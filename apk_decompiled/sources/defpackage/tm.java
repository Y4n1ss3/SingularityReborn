package defpackage;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class tm implements oy {
    public final /* synthetic */ List d;
    public final /* synthetic */ un e;
    public final /* synthetic */ ky f;
    public final /* synthetic */ jm g;
    public final /* synthetic */ MutableState h;
    public final /* synthetic */ MutableState i;

    public tm(List list, un unVar, ky kyVar, jm jmVar, MutableState mutableState, MutableState mutableState2) {
        this.d = list;
        this.e = unVar;
        this.f = kyVar;
        this.g = jmVar;
        this.h = mutableState;
        this.i = mutableState2;
    }

    @Override // defpackage.oy
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        LazyItemScope lazyItemScope = (LazyItemScope) obj;
        int intValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (composer.changed(lazyItemScope) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= composer.changed(intValue) ? 32 : 16;
        }
        if (composer.shouldExecute((i & 147) != 146, i & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(802480018, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            km kmVar = (km) this.d.get(intValue);
            composer.startReplaceGroup(2127045537);
            un unVar = this.e;
            boolean changedInstance = composer.changedInstance(unVar) | composer.changed(this.f);
            jm jmVar = this.g;
            boolean changedInstance2 = changedInstance | composer.changedInstance(jmVar);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance2 || rememberedValue == Composer.Companion.getEmpty()) {
                rm rmVar = new rm(jmVar, this.e, this.f, this.h, this.i);
                composer.updateRememberedValue(rmVar);
                rememberedValue = rmVar;
            }
            ky kyVar = (ky) rememberedValue;
            boolean changedInstance3 = composer.changedInstance(unVar) | composer.changedInstance(jmVar);
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new sm(unVar, jmVar, this.h, this.i);
                composer.updateRememberedValue(rememberedValue2);
            }
            um.a(kmVar, kyVar, (ky) rememberedValue2, composer, 0);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return w01.a;
    }
}
