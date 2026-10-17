package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.input.internal.LegacyPlatformTextInputServiceAdapter;
import androidx.compose.ui.graphics.Matrix;
import defpackage.ky;
import defpackage.p10;
import defpackage.w01;
import defpackage.xy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1 extends xy implements ky {
    final /* synthetic */ LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode $node;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1(LegacyPlatformTextInputServiceAdapter.LegacyPlatformTextInputNode legacyPlatformTextInputNode) {
        super(1, p10.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.$node = legacyPlatformTextInputNode;
    }

    @Override // defpackage.ky
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m1264invoke58bKbWc(((Matrix) obj).m5028unboximpl());
        return w01.a;
    }

    /* renamed from: invoke-58bKbWc, reason: not valid java name */
    public final void m1264invoke58bKbWc(float[] fArr) {
        AndroidLegacyPlatformTextInputServiceAdapter.startInput$localToScreen(this.$node, fArr);
    }
}
