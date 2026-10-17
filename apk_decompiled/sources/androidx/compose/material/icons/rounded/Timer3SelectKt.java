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
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Timer3SelectKt {
    private static ImageVector _timer3Select;

    public static final ImageVector getTimer3Select(Icons.Rounded rounded) {
        ImageVector imageVector = _timer3Select;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Timer3Select", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(21.0f, 12.0f, 21.0f, 12.0f);
        i.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        kf0.x(i, -3.0f, 1.0f, 2.5f);
        i.curveToRelative(0.83f, 0.0f, 1.5f, 0.68f, 1.5f, 1.5f);
        i.verticalLineToRelative(2.0f);
        i.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        i.horizontalLineTo(16.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        i.verticalLineToRelative(0.0f);
        i.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        kf0.x(i, 3.0f, -1.0f, -2.5f);
        i.curveToRelative(-0.82f, 0.0f, -1.5f, -0.68f, -1.5f, -1.5f);
        i.verticalLineToRelative(-2.0f);
        i.curveToRelative(0.0f, -0.82f, 0.68f, -1.5f, 1.5f, -1.5f);
        i.horizontalLineTo(20.0f);
        i.curveTo(20.55f, 11.0f, 21.0f, 11.45f, 21.0f, 12.0f);
        k4.r(i, 4.0f, 6.5f, 4.0f, 6.5f);
        i.curveTo(4.0f, 7.33f, 4.67f, 8.0f, 5.5f, 8.0f);
        r6.y(i, 10.0f, 2.5f, 5.5f);
        i.curveTo(4.67f, 10.5f, 4.0f, 11.17f, 4.0f, 12.0f);
        i.verticalLineToRelative(0.0f);
        i.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        fc.q(i, 10.0f, 16.0f, 5.5f);
        i.curveTo(4.67f, 16.0f, 4.0f, 16.67f, 4.0f, 17.5f);
        i.verticalLineToRelative(0.0f);
        i.curveTo(4.0f, 18.33f, 4.67f, 19.0f, 5.5f, 19.0f);
        i.horizontalLineTo(10.0f);
        i.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        i.verticalLineToRelative(-1.9f);
        i.curveToRelative(0.0f, -1.16f, -0.94f, -2.1f, -2.1f, -2.1f);
        i.curveToRelative(1.16f, 0.0f, 2.1f, -0.94f, 2.1f, -2.1f);
        i.verticalLineTo(8.0f);
        i.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        i.horizontalLineTo(5.5f);
        i.curveTo(4.67f, 5.0f, 4.0f, 5.67f, 4.0f, 6.5f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _timer3Select = build;
        build.getClass();
        return build;
    }
}
