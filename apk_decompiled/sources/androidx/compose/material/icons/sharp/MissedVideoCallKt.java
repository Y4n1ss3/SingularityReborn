package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.bv;
import defpackage.er;
import defpackage.gy;
import defpackage.j50;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MissedVideoCallKt {
    private static ImageVector _missedVideoCall;

    public static final ImageVector getMissedVideoCall(Icons.Sharp sharp) {
        ImageVector imageVector = _missedVideoCall;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.MissedVideoCall", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder f = j50.f(17.0f, 10.5f, 6.0f, 3.0f, 12.0f);
        bv.p(f, 14.0f, -4.5f, 4.0f, 4.0f);
        uo.t(f, -11.0f, -4.0f, 4.0f);
        f.moveTo(10.0f, 15.0f);
        gy.j(f, -3.89f, -3.89f, 2.55f, 5.0f);
        j50.B(f, 9.22f, 4.44f, 1.11f, 6.89f);
        f.lineToRelative(3.11f, 3.1f);
        f.lineToRelative(4.22f, -4.22f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(f, 0.78f, 0.79f, -5.0f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _missedVideoCall = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getMissedVideoCall$annotations(Icons.Sharp sharp) {
    }
}
