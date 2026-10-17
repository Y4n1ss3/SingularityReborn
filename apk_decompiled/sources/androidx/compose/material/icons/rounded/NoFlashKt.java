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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoFlashKt {
    private static ImageVector _noFlash;

    public static final ImageVector getNoFlash(Icons.Rounded rounded) {
        ImageVector imageVector = _noFlash;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NoFlash", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(3.16f, 3.16f);
        b.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.lineToRelative(4.6f, 4.6f);
        b.lineTo(6.14f, 9.4f);
        b.horizontalLineTo(3.6f);
        b.curveTo(2.72f, 9.4f, 2.0f, 10.12f, 2.0f, 11.0f);
        b.verticalLineToRelative(9.4f);
        b.curveTo(2.0f, 21.28f, 2.72f, 22.0f, 3.6f, 22.0f);
        b.horizontalLineToRelative(12.8f);
        b.curveToRelative(0.75f, 0.0f, 1.38f, -0.52f, 1.55f, -1.22f);
        b.lineToRelative(1.47f, 1.47f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        uo.l(b, 3.16f, 3.16f, 10.0f, 20.0f);
        b.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        b.curveToRelative(0.0f, -1.95f, 1.4f, -3.57f, 3.25f, -3.92f);
        b.lineToRelative(1.57f, 1.57f);
        b.curveToRelative(-0.26f, -0.09f, -0.53f, -0.15f, -0.82f, -0.15f);
        b.curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f);
        b.curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f);
        b.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        b.curveToRelative(0.0f, -0.29f, -0.06f, -0.56f, -0.15f, -0.82f);
        b.lineToRelative(1.57f, 1.57f);
        b.curveTo(13.57f, 18.6f, 11.95f, 20.0f, 10.0f, 20.0f);
        k4.r(b, 18.0f, 15.17f, 10.83f, 8.0f);
        b.horizontalLineToRelative(0.87f);
        b.curveToRelative(0.56f, 0.0f, 1.1f, 0.24f, 1.48f, 0.65f);
        b.lineToRelative(0.69f, 0.75f);
        b.horizontalLineToRelative(2.54f);
        b.curveToRelative(0.88f, 0.0f, 1.6f, 0.72f, 1.6f, 1.6f);
        k4.D(b, 15.17f, 20.4f, 5.6f, 0.75f);
        b.curveToRelative(0.38f, 0.0f, 0.62f, 0.41f, 0.44f, 0.74f);
        fc.t(b, 19.0f, 11.0f, 7.0f, -0.5f);
        b.curveTo(18.22f, 7.0f, 18.0f, 6.78f, 18.0f, 6.5f);
        b.verticalLineToRelative(-4.0f);
        b.curveTo(18.0f, 2.22f, 18.22f, 2.0f, 18.5f, 2.0f);
        b.horizontalLineToRelative(2.73f);
        b.curveToRelative(0.36f, 0.0f, 0.6f, 0.37f, 0.46f, 0.7f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 20.4f, 5.6f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noFlash = build;
        build.getClass();
        return build;
    }
}
