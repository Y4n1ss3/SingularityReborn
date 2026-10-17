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
import defpackage.bv;
import defpackage.fc;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ChurchKt {
    private static ImageVector _church;

    public static final ImageVector getChurch(Icons.Rounded rounded) {
        ImageVector imageVector = _church;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Church", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(18.0f, 12.22f, -1.99f);
        h.curveToRelative(0.0f, -0.76f, -0.43f, -1.45f, -1.11f, -1.79f);
        fc.t(h, 13.0f, 6.5f, 5.0f, 1.0f);
        h.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        h.verticalLineToRelative(0.0f);
        h.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        h.horizontalLineToRelative(-1.0f);
        h.verticalLineTo(2.0f);
        h.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        h.horizontalLineToRelative(0.0f);
        h.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        h.verticalLineToRelative(1.0f);
        h.horizontalLineToRelative(-1.0f);
        h.curveTo(9.45f, 3.0f, 9.0f, 3.45f, 9.0f, 4.0f);
        h.verticalLineToRelative(0.0f);
        h.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        bv.C(h, 1.0f, 1.5f, 7.11f, 8.45f);
        h.curveTo(6.43f, 8.79f, 6.0f, 9.48f, 6.0f, 10.24f);
        h.verticalLineToRelative(1.99f);
        h.lineToRelative(-2.81f, 1.25f);
        h.curveTo(2.47f, 13.79f, 2.0f, 14.51f, 2.0f, 15.3f);
        h.verticalLineTo(20.0f);
        h.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        h.horizontalLineToRelative(6.0f);
        h.lineToRelative(0.0f, -2.89f);
        h.curveToRelative(0.0f, -1.0f, 0.68f, -1.92f, 1.66f, -2.08f);
        h.curveTo(12.92f, 16.82f, 14.0f, 17.79f, 14.0f, 19.0f);
        h.verticalLineToRelative(3.0f);
        h.horizontalLineToRelative(6.0f);
        h.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        h.verticalLineToRelative(-4.7f);
        h.curveToRelative(0.0f, -0.79f, -0.47f, -1.51f, -1.19f, -1.83f);
        uo.l(h, 18.0f, 12.22f, 12.0f, 13.5f);
        h.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        h.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        h.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(h, 12.83f, 13.5f, 12.0f, 13.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _church = build;
        build.getClass();
        return build;
    }
}
