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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AppBlockingKt {
    private static ImageVector _appBlocking;

    public static final ImageVector getAppBlocking(Icons.Filled filled) {
        ImageVector imageVector = _appBlocking;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AppBlocking", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.0f, 8.0f);
        b.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        b.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        b.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        b.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        b.close();
        b.moveTo(15.5f, 12.0f);
        b.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        b.curveToRelative(0.42f, 0.0f, 0.8f, 0.11f, 1.15f, 0.29f);
        b.lineToRelative(-3.36f, 3.36f);
        b.curveToRelative(-0.18f, -0.35f, -0.29f, -0.73f, -0.29f, -1.15f);
        b.close();
        b.moveTo(18.0f, 14.5f);
        b.curveToRelative(-0.42f, 0.0f, -0.8f, -0.11f, -1.15f, -0.29f);
        b.lineToRelative(3.36f, -3.36f);
        b.curveToRelative(0.18f, 0.35f, 0.29f, 0.73f, 0.29f, 1.15f);
        b.curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f);
        k4.r(b, 17.0f, 18.0f, 7.0f, 18.0f);
        fc.w(b, 7.0f, 6.0f, 10.0f, 1.0f);
        b.horizontalLineToRelative(2.0f);
        b.lineTo(19.0f, 3.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.lineTo(7.0f, 1.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        b.verticalLineToRelative(18.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(10.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.r(b, -4.0f, -2.0f, 1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _appBlocking = build;
        build.getClass();
        return build;
    }
}
