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
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HdrEnhancedSelectKt {
    private static ImageVector _hdrEnhancedSelect;

    public static final ImageVector getHdrEnhancedSelect(Icons.Outlined outlined) {
        ImageVector imageVector = _hdrEnhancedSelect;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.HdrEnhancedSelect", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        b.reflectiveCurveToRelative(-2.69f, 6.0f, -6.0f, 6.0f);
        b.reflectiveCurveToRelative(-6.0f, -2.69f, -6.0f, -6.0f);
        b.reflectiveCurveTo(8.69f, 2.0f, 12.0f, 2.0f);
        b.close();
        b.moveTo(12.0f, 4.0f);
        b.curveTo(9.79f, 4.0f, 8.0f, 5.79f, 8.0f, 8.0f);
        b.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        b.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        b.reflectiveCurveTo(14.21f, 4.0f, 12.0f, 4.0f);
        af0.r(b, 13.0f, 11.0f, -2.0f, 9.0f);
        b.horizontalLineTo(9.0f);
        b.verticalLineTo(7.0f);
        b.horizontalLineToRelative(2.0f);
        b.verticalLineTo(5.0f);
        af0.v(b, 2.0f, 2.0f, 2.0f, 2.0f);
        uo.r(b, -2.0f, 11.0f, 24.0f, 20.0f);
        af0.v(b, -2.0f, 2.0f, -1.5f, -2.0f);
        af0.v(b, -2.0f, -1.5f, 2.0f, -2.0f);
        bv.h(b, 22.0f, 2.0f, 2.0f, 20.0f);
        b.moveTo(18.0f, 18.5f);
        b.curveToRelative(0.0f, 0.6f, -0.4f, 1.1f, -0.9f, 1.4f);
        b.lineTo(18.0f, 22.0f);
        kf0.B(b, -1.5f, -0.9f, -2.0f, -1.1f);
        af0.B(b, 2.0f, 13.0f, -6.0f, 3.5f);
        b.curveToRelative(0.8f, 0.0f, 1.5f, 0.7f, 1.5f, 1.5f);
        kf0.D(b, 18.5f, 16.5f, 18.5f, -1.0f);
        kp0.j(b, -2.0f, 1.0f, 16.5f);
        uf.D(b, 3.5f, 18.0f, -2.0f, 5.0f);
        af0.B(b, 6.0f, 3.5f, -2.5f, -2.0f);
        bv.A(b, 22.0f, 0.0f, -6.0f, 1.5f);
        kf0.n(b, 2.0f, 3.5f, 10.0f, 16.0f);
        b.curveToRelative(0.8f, 0.0f, 1.5f, 0.7f, 1.5f, 1.5f);
        b.verticalLineToRelative(3.0f);
        b.curveToRelative(0.0f, 0.8f, -0.7f, 1.5f, -1.5f, 1.5f);
        fc.j(b, 6.5f, -6.0f, 10.0f);
        uf.D(b, 10.0f, 20.5f, -3.0f, 8.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.e(b, 3.0f, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hdrEnhancedSelect = build;
        build.getClass();
        return build;
    }
}
