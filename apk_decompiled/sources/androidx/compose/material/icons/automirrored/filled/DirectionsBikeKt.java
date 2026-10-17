package androidx.compose.material.icons.automirrored.filled;

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
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DirectionsBikeKt {
    private static ImageVector _directionsBike;

    public static final ImageVector getDirectionsBike(Icons.AutoMirrored.Filled filled) {
        ImageVector imageVector = _directionsBike;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Filled.DirectionsBike", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(15.5f, 5.5f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        b.close();
        b.moveTo(5.0f, 12.0f);
        b.curveToRelative(-2.8f, 0.0f, -5.0f, 2.2f, -5.0f, 5.0f);
        b.reflectiveCurveToRelative(2.2f, 5.0f, 5.0f, 5.0f);
        b.reflectiveCurveToRelative(5.0f, -2.2f, 5.0f, -5.0f);
        b.reflectiveCurveToRelative(-2.2f, -5.0f, -5.0f, -5.0f);
        b.close();
        b.moveTo(5.0f, 20.5f);
        b.curveToRelative(-1.9f, 0.0f, -3.5f, -1.6f, -3.5f, -3.5f);
        b.reflectiveCurveToRelative(1.6f, -3.5f, 3.5f, -3.5f);
        b.reflectiveCurveToRelative(3.5f, 1.6f, 3.5f, 3.5f);
        b.reflectiveCurveToRelative(-1.6f, 3.5f, -3.5f, 3.5f);
        k4.x(b, 10.8f, 10.5f, 2.4f, -2.4f);
        b.lineToRelative(0.8f, 0.8f);
        b.curveToRelative(1.3f, 1.3f, 3.0f, 2.1f, 5.1f, 2.1f);
        b.lineTo(19.1f, 9.0f);
        b.curveToRelative(-1.5f, 0.0f, -2.7f, -0.6f, -3.6f, -1.5f);
        b.lineToRelative(-1.9f, -1.9f);
        b.curveToRelative(-0.5f, -0.4f, -1.0f, -0.6f, -1.6f, -0.6f);
        b.reflectiveCurveToRelative(-1.1f, 0.2f, -1.4f, 0.6f);
        b.lineTo(7.8f, 8.4f);
        b.curveToRelative(-0.4f, 0.4f, -0.6f, 0.9f, -0.6f, 1.4f);
        b.curveToRelative(0.0f, 0.6f, 0.2f, 1.1f, 0.6f, 1.4f);
        af0.m(b, 11.0f, 14.0f, 5.0f, 2.0f);
        uo.t(b, -6.2f, -2.2f, -2.3f);
        b.moveTo(19.0f, 12.0f);
        b.curveToRelative(-2.8f, 0.0f, -5.0f, 2.2f, -5.0f, 5.0f);
        b.reflectiveCurveToRelative(2.2f, 5.0f, 5.0f, 5.0f);
        b.reflectiveCurveToRelative(5.0f, -2.2f, 5.0f, -5.0f);
        b.reflectiveCurveToRelative(-2.2f, -5.0f, -5.0f, -5.0f);
        b.close();
        b.moveTo(19.0f, 20.5f);
        b.curveToRelative(-1.9f, 0.0f, -3.5f, -1.6f, -3.5f, -3.5f);
        b.reflectiveCurveToRelative(1.6f, -3.5f, 3.5f, -3.5f);
        b.reflectiveCurveToRelative(3.5f, 1.6f, 3.5f, 3.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, -1.6f, 3.5f, -3.5f, 3.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _directionsBike = build;
        build.getClass();
        return build;
    }
}
