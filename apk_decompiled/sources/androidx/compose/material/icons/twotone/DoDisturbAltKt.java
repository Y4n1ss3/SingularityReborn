package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DoDisturbAltKt {
    private static ImageVector _doDisturbAlt;

    public static final ImageVector getDoDisturbAlt(Icons.TwoTone twoTone) {
        ImageVector imageVector = _doDisturbAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.DoDisturbAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.5f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.5f, 10.0f, -10.0f);
        b.reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f);
        b.close();
        b.moveTo(4.0f, 12.0f);
        b.curveToRelative(0.0f, -4.4f, 3.6f, -8.0f, 8.0f, -8.0f);
        b.curveToRelative(1.8f, 0.0f, 3.5f, 0.6f, 4.9f, 1.7f);
        b.lineTo(5.7f, 16.9f);
        b.curveTo(4.6f, 15.5f, 4.0f, 13.8f, 4.0f, 12.0f);
        b.close();
        b.moveTo(12.0f, 20.0f);
        b.curveToRelative(-1.8f, 0.0f, -3.5f, -0.6f, -4.9f, -1.7f);
        b.lineTo(18.3f, 7.1f);
        b.curveTo(19.4f, 8.5f, 20.0f, 10.2f, 20.0f, 12.0f);
        b.curveToRelative(0.0f, 4.4f, -3.6f, 8.0f, -8.0f, 8.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doDisturbAlt = build;
        build.getClass();
        return build;
    }
}
