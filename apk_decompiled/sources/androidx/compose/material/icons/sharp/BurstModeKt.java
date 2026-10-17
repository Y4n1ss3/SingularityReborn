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
import defpackage.af0;
import defpackage.bv;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BurstModeKt {
    private static ImageVector _burstMode;

    public static final ImageVector getBurstMode(Icons.Sharp sharp) {
        ImageVector imageVector = _burstMode;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.BurstMode", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(1.0f, 5.0f, 2.0f, 14.0f);
        r6.C(b, 1.0f, 19.0f, 1.0f, 5.0f);
        k4.C(b, 5.0f, 5.0f, 2.0f, 14.0f);
        r6.C(b, 5.0f, 19.0f, 5.0f, 5.0f);
        b.moveTo(23.0f, 5.0f);
        af0.m(b, 9.0f, 5.0f, 14.0f, 14.0f);
        uo.l(b, 23.0f, 5.0f, 11.0f, 17.0f);
        b.lineToRelative(2.5f, -3.15f);
        b.lineTo(15.29f, 16.0f);
        b.lineToRelative(2.5f, -3.22f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b, 21.0f, 17.0f, 11.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _burstMode = build;
        build.getClass();
        return build;
    }
}
