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
import defpackage.gy;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NearbyOffKt {
    private static ImageVector _nearbyOff;

    public static final ImageVector getNearbyOff(Icons.Sharp sharp) {
        ImageVector imageVector = _nearbyOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.NearbyOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(22.82f, 12.01f, 18.83f, 16.0f);
        i.lineToRelative(-1.81f, -1.81f);
        i.lineTo(19.2f, 12.0f);
        i.lineTo(12.0f, 4.8f);
        i.lineTo(9.81f, 6.99f);
        i.lineTo(8.0f, 5.17f);
        gy.B(i, 3.99f, -3.99f, 22.82f, 12.01f);
        i.moveTo(21.19f, 21.19f);
        i.lineToRelative(-1.41f, 1.41f);
        i.lineTo(16.0f, 18.83f);
        i.lineToRelative(-3.99f, 3.99f);
        i.lineTo(1.18f, 11.99f);
        i.lineTo(5.17f, 8.0f);
        i.lineTo(1.39f, 4.22f);
        r6.C(i, 2.8f, 2.81f, 21.19f, 21.19f);
        i.moveTo(14.19f, 17.02f);
        i.lineToRelative(-1.39f, -1.39f);
        i.lineToRelative(-0.8f, 0.8f);
        i.lineTo(7.58f, 12.0f);
        i.lineToRelative(0.8f, -0.8f);
        i.lineToRelative(-1.4f, -1.39f);
        i.lineTo(4.8f, 12.0f);
        gy.B(i, 7.2f, 7.2f, 14.19f, 17.02f);
        i.moveTo(16.42f, 12.0f);
        i.lineTo(12.0f, 7.58f);
        i.lineToRelative(-0.8f, 0.8f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(i, 4.42f, 4.42f, 16.42f, 12.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nearbyOff = build;
        build.getClass();
        return build;
    }
}
