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
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class JavascriptKt {
    private static ImageVector _javascript;

    public static final ImageVector getJavascript(Icons.Filled filled) {
        ImageVector imageVector = _javascript;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Javascript", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(12.0f, 14.0f, -1.0f, 1.5f, 0.5f);
        k4.k(s, 2.0f, -1.0f, 13.0f);
        s.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        s.verticalLineTo(10.0f);
        s.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        s.horizontalLineToRelative(3.0f);
        s.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        r6.D(s, 1.0f, -1.5f, -0.5f, -2.0f);
        s.verticalLineToRelative(1.0f);
        s.horizontalLineTo(16.0f);
        s.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        s.verticalLineTo(14.0f);
        s.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        s.horizontalLineToRelative(-3.0f);
        s.curveTo(12.45f, 15.0f, 12.0f, 14.55f, 12.0f, 14.0f);
        af0.A(s, 9.0f, 9.0f, 4.5f, 7.5f);
        r6.s(s, -1.0f, 6.0f, 1.0f);
        s.curveTo(6.0f, 14.33f, 6.67f, 15.0f, 7.5f, 15.0f);
        s.horizontalLineTo(9.0f);
        s.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        s.verticalLineTo(9.0f);
        s.curveTo(10.5f, 9.0f, 9.83f, 9.0f, 9.0f, 9.0f);
        s.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, s.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _javascript = build;
        build.getClass();
        return build;
    }
}
