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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PermIdentityKt {
    private static ImageVector _permIdentity;

    public static final ImageVector getPermIdentity(Icons.Filled filled) {
        ImageVector imageVector = _permIdentity;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PermIdentity", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 5.9f);
        b.curveToRelative(1.16f, 0.0f, 2.1f, 0.94f, 2.1f, 2.1f);
        b.reflectiveCurveToRelative(-0.94f, 2.1f, -2.1f, 2.1f);
        b.reflectiveCurveTo(9.9f, 9.16f, 9.9f, 8.0f);
        b.reflectiveCurveToRelative(0.94f, -2.1f, 2.1f, -2.1f);
        b.moveToRelative(0.0f, 9.0f);
        b.curveToRelative(2.97f, 0.0f, 6.1f, 1.46f, 6.1f, 2.1f);
        b.verticalLineToRelative(1.1f);
        b.lineTo(5.9f, 18.1f);
        b.lineTo(5.9f, 17.0f);
        b.curveToRelative(0.0f, -0.64f, 3.13f, -2.1f, 6.1f, -2.1f);
        b.moveTo(12.0f, 4.0f);
        b.curveTo(9.79f, 4.0f, 8.0f, 5.79f, 8.0f, 8.0f);
        b.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        b.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        b.reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f);
        b.close();
        b.moveTo(12.0f, 13.0f);
        b.curveToRelative(-2.67f, 0.0f, -8.0f, 1.34f, -8.0f, 4.0f);
        kf0.z(b, 3.0f, 16.0f, -3.0f);
        b.curveToRelative(0.0f, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _permIdentity = build;
        build.getClass();
        return build;
    }
}
