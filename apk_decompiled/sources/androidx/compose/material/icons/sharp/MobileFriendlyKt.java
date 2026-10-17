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
import defpackage.j50;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MobileFriendlyKt {
    private static ImageVector _mobileFriendly;

    public static final ImageVector getMobileFriendly(Icons.Sharp sharp) {
        ImageVector imageVector = _mobileFriendly;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.MobileFriendly", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(21.0f, 1.0f, 7.0f, 5.0f, 2.0f);
        j50.B(i, 4.0f, 10.0f, 16.0f, 9.0f);
        af0.B(i, -2.0f, 7.0f, 5.0f, 14.0f);
        bv.t(i, 1.0f, 7.01f, 13.47f);
        i.lineToRelative(-2.55f, -2.55f);
        i.lineToRelative(-1.27f, 1.27f);
        i.lineTo(7.0f, 16.0f);
        i.lineToRelative(7.19f, -7.19f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(i, -1.27f, -1.27f, -5.91f, 5.93f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mobileFriendly = build;
        build.getClass();
        return build;
    }
}
