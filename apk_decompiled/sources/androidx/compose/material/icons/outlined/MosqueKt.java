package androidx.compose.material.icons.outlined;

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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MosqueKt {
    private static ImageVector _mosque;

    public static final ImageVector getMosque(Icons.Outlined outlined) {
        ImageVector imageVector = _mosque;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Mosque", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(24.0f, 7.0f);
        b.curveToRelative(0.0f, -1.1f, -2.0f, -3.0f, -2.0f, -3.0f);
        b.reflectiveCurveToRelative(-2.0f, 1.9f, -2.0f, 3.0f);
        b.curveToRelative(0.0f, 0.74f, 0.4f, 1.38f, 1.0f, 1.72f);
        kf0.r(b, 13.0f, -2.0f, -2.0f);
        b.curveToRelative(0.0f, -0.95f, -0.66f, -1.74f, -1.55f, -1.94f);
        b.curveTo(17.79f, 8.48f, 18.0f, 7.81f, 18.0f, 7.09f);
        b.curveToRelative(0.0f, -1.31f, -0.65f, -2.53f, -1.74f, -3.25f);
        b.lineTo(12.0f, 1.0f);
        b.lineTo(7.74f, 3.84f);
        b.curveTo(6.65f, 4.56f, 6.0f, 5.78f, 6.0f, 7.09f);
        b.curveToRelative(0.0f, 0.72f, 0.21f, 1.39f, 0.55f, 1.96f);
        b.curveTo(5.66f, 9.26f, 5.0f, 10.05f, 5.0f, 11.0f);
        gy.i(b, 2.0f, 3.0f, 8.72f);
        b.curveTo(3.6f, 8.38f, 4.0f, 7.74f, 4.0f, 7.0f);
        b.curveToRelative(0.0f, -1.1f, -2.0f, -3.0f, -2.0f, -3.0f);
        b.reflectiveCurveTo(0.0f, 5.9f, 0.0f, 7.0f);
        b.curveToRelative(0.0f, 0.74f, 0.4f, 1.38f, 1.0f, 1.72f);
        kf0.r(b, 21.0f, 10.0f, -4.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        bv.x(b, 4.0f, 10.0f, 8.72f);
        b.curveTo(23.6f, 8.38f, 24.0f, 7.74f, 24.0f, 7.0f);
        k4.r(b, 8.85f, 5.5f, 12.0f, 3.4f);
        b.lineToRelative(3.15f, 2.1f);
        b.curveTo(15.68f, 5.86f, 16.0f, 6.45f, 16.0f, 7.09f);
        b.curveTo(16.0f, 8.14f, 15.14f, 9.0f, 14.09f, 9.0f);
        b.horizontalLineTo(9.91f);
        b.curveTo(8.86f, 9.0f, 8.0f, 8.14f, 8.0f, 7.09f);
        b.curveTo(8.0f, 6.45f, 8.32f, 5.86f, 8.85f, 5.5f);
        r6.B(b, 21.0f, 19.0f, -6.0f, -2.0f);
        b.curveToRelative(0.0f, -1.65f, -1.35f, -3.0f, -3.0f, -3.0f);
        b.curveToRelative(-1.65f, 0.0f, -3.0f, 1.35f, -3.0f, 3.0f);
        af0.B(b, 2.0f, 3.0f, -4.0f, 4.0f);
        r6.D(b, -4.0f, 10.0f, 4.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(b, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mosque = build;
        build.getClass();
        return build;
    }
}
