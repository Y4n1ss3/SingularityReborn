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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SleddingKt {
    private static ImageVector _sledding;

    public static final ImageVector getSledding(Icons.Sharp sharp) {
        ImageVector imageVector = _sledding;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Sledding", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(14.0f, 4.5f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveTo(14.0f, 3.4f, 14.0f, 4.5f);
        k4.x(b, 17.22f, 17.9f, 1.93f, 0.63f);
        b.lineToRelative(-0.46f, 1.43f);
        b.lineToRelative(-3.32f, -1.08f);
        b.lineTo(14.9f, 20.3f);
        b.lineToRelative(3.32f, 1.08f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(1.31f, 0.43f, 2.72f, -0.29f, 3.15f, -1.61f);
        b.curveToRelative(0.43f, -1.31f, -0.29f, -2.72f, -1.61f, -3.15f);
        b.lineToRelative(0.46f, -1.43f);
        b.curveToRelative(2.1f, 0.68f, 3.25f, 2.94f, 2.57f, 5.04f);
        b.curveToRelative(-0.68f, 2.1f, -2.94f, 3.25f, -5.04f, 2.57f);
        b.horizontalLineToRelative(0.0f);
        b.lineTo(1.0f, 17.36f);
        b.lineToRelative(0.46f, -1.43f);
        b.lineToRelative(3.93f, 1.28f);
        b.lineToRelative(0.46f, -1.43f);
        b.lineTo(1.93f, 14.5f);
        b.lineToRelative(0.46f, -1.43f);
        b.lineTo(4.0f, 13.6f);
        b.verticalLineTo(9.5f);
        b.lineToRelative(5.47f, -2.35f);
        b.curveToRelative(0.39f, -0.17f, 0.84f, -0.21f, 1.28f, -0.07f);
        b.curveToRelative(0.95f, 0.31f, 1.46f, 1.32f, 1.16f, 2.27f);
        b.lineToRelative(-1.05f, 3.24f);
        r6.C(b, 14.5f, 12.0f, 17.22f, 17.9f);
        b.moveTo(6.0f, 14.25f);
        b.lineToRelative(0.48f, 0.16f);
        b.lineToRelative(0.75f, -2.31f);
        b.lineTo(7.92f, 10.0f);
        uf.o(b, 6.0f, 10.82f, 14.25f);
        b.moveTo(13.94f, 18.41f);
        b.lineToRelative(-6.66f, -2.16f);
        b.lineToRelative(-0.46f, 1.43f);
        gy.B(b, 6.66f, 2.16f, 13.94f, 18.41f);
        b.moveTo(14.63f, 17.05f);
        b.lineToRelative(-1.18f, -2.56f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, -3.97f, 0.89f, 14.63f, 17.05f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sledding = build;
        build.getClass();
        return build;
    }
}
