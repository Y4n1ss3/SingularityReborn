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
import defpackage.fc;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OpenInBrowserKt {
    private static ImageVector _openInBrowser;

    public static final ImageVector getOpenInBrowser(Icons.Rounded rounded) {
        ImageVector imageVector = _openInBrowser;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.OpenInBrowser", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(19.0f, 4.0f, 5.0f, 4.0f);
        i.curveToRelative(-1.11f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        i.verticalLineToRelative(12.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(3.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        i.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        i.lineTo(5.0f, 18.0f);
        fc.w(i, 5.0f, 8.0f, 14.0f, 10.0f);
        i.horizontalLineToRelative(-3.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        i.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        i.horizontalLineToRelative(3.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(21.0f, 6.0f);
        i.curveToRelative(0.0f, -1.1f, -0.89f, -2.0f, -2.0f, -2.0f);
        k4.x(i, 11.65f, 10.35f, -2.79f, 2.79f);
        i.curveToRelative(-0.32f, 0.32f, -0.1f, 0.86f, 0.35f, 0.86f);
        i.lineTo(11.0f, 14.0f);
        i.verticalLineToRelative(5.0f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        i.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        i.verticalLineToRelative(-5.0f);
        i.horizontalLineToRelative(1.79f);
        i.curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        i.lineToRelative(-2.79f, -2.79f);
        i.curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.7f, -0.01f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _openInBrowser = build;
        build.getClass();
        return build;
    }
}
