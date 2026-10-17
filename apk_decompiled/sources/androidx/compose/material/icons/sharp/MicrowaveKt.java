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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MicrowaveKt {
    private static ImageVector _microwave;

    public static final ImageVector getMicrowave(Icons.Sharp sharp) {
        ImageVector imageVector = _microwave;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Microwave", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(6.8f, 10.61f, 5.37f, 9.19f);
        i.curveTo(5.73f, 8.79f, 6.59f, 8.0f, 7.75f, 8.0f);
        i.curveToRelative(0.8f, 0.0f, 1.39f, 0.39f, 1.81f, 0.67f);
        i.curveTo(9.87f, 8.88f, 10.07f, 9.0f, 10.25f, 9.0f);
        i.curveToRelative(0.37f, 0.0f, 0.8f, -0.41f, 0.95f, -0.61f);
        i.lineToRelative(1.42f, 1.42f);
        i.curveToRelative(-0.36f, 0.4f, -1.22f, 1.19f, -2.37f, 1.19f);
        i.curveToRelative(-0.79f, 0.0f, -1.37f, -0.38f, -1.79f, -0.66f);
        i.curveTo(8.13f, 10.12f, 7.94f, 10.0f, 7.75f, 10.0f);
        i.curveTo(7.38f, 10.0f, 6.95f, 10.41f, 6.8f, 10.61f);
        i.close();
        i.moveTo(7.75f, 15.0f);
        i.curveToRelative(0.19f, 0.0f, 0.38f, 0.12f, 0.71f, 0.34f);
        i.curveToRelative(0.42f, 0.28f, 1.0f, 0.66f, 1.79f, 0.66f);
        i.curveToRelative(1.16f, 0.0f, 2.01f, -0.79f, 2.37f, -1.19f);
        i.lineToRelative(-1.42f, -1.42f);
        i.curveToRelative(-0.15f, 0.2f, -0.59f, 0.61f, -0.95f, 0.61f);
        i.curveToRelative(-0.18f, 0.0f, -0.38f, -0.12f, -0.69f, -0.33f);
        i.curveTo(9.14f, 13.39f, 8.55f, 13.0f, 7.75f, 13.0f);
        i.curveToRelative(-1.16f, 0.0f, -2.02f, 0.79f, -2.38f, 1.19f);
        i.lineToRelative(1.42f, 1.42f);
        i.curveTo(6.95f, 15.41f, 7.38f, 15.0f, 7.75f, 15.0f);
        af0.A(i, 22.0f, 4.0f, 16.0f, 2.0f);
        bv.z(i, 4.0f, 22.0f, 14.0f, 6.0f);
        bv.h(i, 4.0f, 12.0f, 10.0f, 6.0f);
        i.moveTo(19.0f, 16.0f);
        i.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        i.curveTo(18.55f, 17.0f, 19.0f, 16.55f, 19.0f, 16.0f);
        i.close();
        i.moveTo(19.0f, 12.0f);
        i.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        i.curveTo(18.55f, 13.0f, 19.0f, 12.55f, 19.0f, 12.0f);
        r6.B(i, 19.0f, 7.0f, -2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(i, 2.0f, 7.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _microwave = build;
        build.getClass();
        return build;
    }
}
