package androidx.compose.material.icons.filled;

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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoFlashKt {
    private static ImageVector _noFlash;

    public static final ImageVector getNoFlash(Icons.Filled filled) {
        ImageVector imageVector = _noFlash;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NoFlash", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(13.93f, 13.93f, 2.45f, 2.45f);
        i.lineTo(1.04f, 3.87f);
        i.lineToRelative(5.3f, 5.3f);
        i.lineTo(6.14f, 9.4f);
        i.horizontalLineTo(3.6f);
        i.curveTo(2.72f, 9.4f, 2.0f, 10.12f, 2.0f, 11.0f);
        i.verticalLineToRelative(9.4f);
        i.curveTo(2.0f, 21.28f, 2.72f, 22.0f, 3.6f, 22.0f);
        i.horizontalLineToRelative(12.8f);
        i.curveToRelative(0.75f, 0.0f, 1.38f, -0.52f, 1.55f, -1.22f);
        i.lineToRelative(2.18f, 2.18f);
        i.lineToRelative(1.41f, -1.41f);
        r6.C(i, 18.0f, 18.0f, 13.93f, 13.93f);
        i.moveTo(10.0f, 20.0f);
        i.curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f);
        i.curveToRelative(0.0f, -1.95f, 1.4f, -3.57f, 3.25f, -3.92f);
        i.lineToRelative(1.57f, 1.57f);
        i.curveToRelative(-0.26f, -0.09f, -0.53f, -0.15f, -0.82f, -0.15f);
        i.curveToRelative(-1.38f, 0.0f, -2.5f, 1.12f, -2.5f, 2.5f);
        i.curveToRelative(0.0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f);
        i.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        i.curveToRelative(0.0f, -0.29f, -0.06f, -0.56f, -0.15f, -0.82f);
        i.lineToRelative(1.57f, 1.57f);
        i.curveTo(13.57f, 18.6f, 11.95f, 20.0f, 10.0f, 20.0f);
        k4.r(i, 18.0f, 15.17f, 10.83f, 8.0f);
        kf0.B(i, 1.75f, 1.28f, 1.4f, 2.54f);
        i.curveToRelative(0.88f, 0.0f, 1.6f, 0.72f, 1.6f, 1.6f);
        k4.B(i, 15.17f, 20.4f, 5.6f, 22.0f);
        fc.t(i, 19.0f, 11.0f, 7.0f, -1.0f);
        i.verticalLineTo(2.0f);
        i.horizontalLineToRelative(4.0f);
        i.lineTo(20.4f, 5.6f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noFlash = build;
        build.getClass();
        return build;
    }
}
