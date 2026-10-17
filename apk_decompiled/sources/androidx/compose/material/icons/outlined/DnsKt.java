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
import defpackage.fc;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DnsKt {
    private static ImageVector _dns;

    public static final ImageVector getDns(Icons.Outlined outlined) {
        ImageVector imageVector = _dns;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Dns", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = fc.d(19.0f, 15.0f, 4.0f, 5.0f, -4.0f);
        d.horizontalLineToRelative(14.0f);
        d.moveToRelative(1.0f, -2.0f);
        d.horizontalLineTo(4.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        d.verticalLineToRelative(6.0f);
        d.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        d.horizontalLineToRelative(16.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        d.verticalLineToRelative(-6.0f);
        d.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        d.close();
        d.moveTo(7.0f, 18.5f);
        d.curveToRelative(-0.82f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        d.reflectiveCurveToRelative(0.68f, -1.5f, 1.5f, -1.5f);
        d.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        d.reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f);
        af0.A(d, 19.0f, 5.0f, 4.0f, 5.0f);
        d.verticalLineTo(5.0f);
        d.horizontalLineToRelative(14.0f);
        d.moveToRelative(1.0f, -2.0f);
        d.horizontalLineTo(4.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        d.verticalLineToRelative(6.0f);
        d.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        d.horizontalLineToRelative(16.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        d.verticalLineTo(4.0f);
        d.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        d.close();
        d.moveTo(7.0f, 8.5f);
        d.curveToRelative(-0.82f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        d.reflectiveCurveTo(6.18f, 5.5f, 7.0f, 5.5f);
        d.reflectiveCurveToRelative(1.5f, 0.68f, 1.5f, 1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(d, 7.83f, 8.5f, 7.0f, 8.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dns = build;
        build.getClass();
        return build;
    }
}
