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
import defpackage.fc;
import defpackage.j50;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NestCamWiredStandKt {
    private static ImageVector _nestCamWiredStand;

    public static final ImageVector getNestCamWiredStand(Icons.Sharp sharp) {
        ImageVector imageVector = _nestCamWiredStand;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.NestCamWiredStand", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(18.0f, 0.85f, 11.98f, 1.4f);
        i.curveTo(8.95f, 1.7f, 6.37f, 4.0f, 6.04f, 7.03f);
        i.curveToRelative(-0.39f, 3.57f, 2.2f, 6.69f, 5.68f, 7.04f);
        i.lineToRelative(1.9f, 0.19f);
        i.lineToRelative(-0.56f, 0.85f);
        i.curveToRelative(-0.88f, -0.19f, -1.83f, -0.18f, -2.85f, 0.25f);
        i.curveTo(8.21f, 16.21f, 7.0f, 18.25f, 7.0f, 20.41f);
        fc.w(i, 7.0f, 23.0f, 10.0f, -3.0f);
        i.curveToRelative(0.0f, -1.67f, -0.83f, -3.15f, -2.09f, -4.06f);
        i.lineToRelative(0.97f, -1.45f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.l(i, 18.0f, 14.72f, 0.85f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nestCamWiredStand = build;
        build.getClass();
        return build;
    }
}
