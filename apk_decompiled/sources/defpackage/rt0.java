package defpackage;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class rt0 implements oy {
    public final /* synthetic */ List d;

    public rt0(List list) {
        this.d = list;
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
            String str = (String) this.d.get(intValue);
            composer.startReplaceGroup(-1948403629);
            GenericFontFamily monospace = FontFamily.Companion.getMonospace();
            TextKt.m2607TextNvy7gAk(str, null, ColorKt.Color(ks0.c0(str, ">", false) ? 4286756095L : 4292731888L), null, TextUnitKt.getSp(12), null, null, monospace, 0L, null, null, TextUnitKt.getSp(18), 0, false, 0, 0, null, null, composer, 24576, 48, 259946);
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
