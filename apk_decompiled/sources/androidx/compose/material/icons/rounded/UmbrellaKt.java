package androidx.compose.material.icons.rounded;

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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UmbrellaKt {
    private static ImageVector _umbrella;

    public static final ImageVector getUmbrella(Icons.Rounded rounded) {
        ImageVector imageVector = _umbrella;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Umbrella", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(17.12f, 6.28f, 14.5f, 6.92f);
        i.lineTo(13.0f, 5.77f);
        i.verticalLineTo(3.88f);
        i.verticalLineTo(3.4f);
        i.curveToRelative(0.0f, -0.26f, 0.22f, -0.48f, 0.5f, -0.48f);
        i.curveToRelative(0.23f, 0.0f, 0.43f, 0.16f, 0.49f, 0.36f);
        i.curveTo(14.1f, 3.7f, 14.49f, 4.0f, 14.94f, 4.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        i.curveToRelative(0.0f, -0.1f, -0.02f, -0.2f, -0.05f, -0.3f);
        i.curveTo(15.59f, 1.72f, 14.63f, 1.0f, 13.5f, 1.0f);
        i.curveTo(12.12f, 1.0f, 11.0f, 2.07f, 11.0f, 3.4f);
        i.verticalLineToRelative(0.48f);
        i.verticalLineToRelative(1.89f);
        i.lineTo(9.5f, 6.92f);
        i.lineTo(6.88f, 6.28f);
        i.curveTo(6.5f, 6.19f, 6.16f, 6.55f, 6.28f, 6.92f);
        i.lineToRelative(4.77f, 14.39f);
        i.curveTo(11.2f, 21.77f, 11.6f, 22.0f, 12.0f, 22.0f);
        i.reflectiveCurveToRelative(0.8f, -0.23f, 0.95f, -0.69f);
        i.lineToRelative(4.77f, -14.39f);
        i.curveTo(17.84f, 6.55f, 17.5f, 6.19f, 17.12f, 6.28f);
        k4.r(i, 11.0f, 14.8f, 9.03f, 8.86f);
        i.lineToRelative(0.92f, 0.23f);
        i.lineToRelative(0.76f, -0.58f);
        uf.o(i, 11.0f, 8.29f, 14.8f);
        i.moveTo(13.0f, 14.8f);
        i.verticalLineTo(8.29f);
        i.lineToRelative(0.28f, 0.22f);
        i.lineToRelative(0.76f, 0.58f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(i, 0.92f, -0.23f, 13.0f, 14.8f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _umbrella = build;
        build.getClass();
        return build;
    }
}
