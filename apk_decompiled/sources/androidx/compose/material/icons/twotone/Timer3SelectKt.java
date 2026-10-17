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
import defpackage.af0;
import defpackage.k4;
import defpackage.kp0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Timer3SelectKt {
    private static ImageVector _timer3Select;

    public static final ImageVector getTimer3Select(Icons.TwoTone twoTone) {
        ImageVector imageVector = _timer3Select;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Timer3Select", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(21.0f, 11.0f, 2.0f, -4.0f, 1.0f);
        s.horizontalLineToRelative(2.5f);
        s.curveToRelative(0.83f, 0.0f, 1.5f, 0.68f, 1.5f, 1.5f);
        s.verticalLineToRelative(2.0f);
        s.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        uf.k(s, 15.0f, -2.0f, 4.0f, -1.0f);
        s.horizontalLineToRelative(-2.5f);
        s.curveToRelative(-0.82f, 0.0f, -1.5f, -0.68f, -1.5f, -1.5f);
        s.verticalLineToRelative(-2.0f);
        s.curveToRelative(0.0f, -0.82f, 0.68f, -1.5f, 1.5f, -1.5f);
        kp0.D(s, 21.0f, 4.0f, 5.0f, 3.0f);
        af0.z(s, 6.0f, 2.5f, 4.0f, 3.0f);
        af0.p(s, 6.0f, 16.0f, 4.0f, 3.0f);
        s.horizontalLineToRelative(6.0f);
        s.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        s.verticalLineToRelative(-1.9f);
        s.curveToRelative(0.0f, -1.16f, -0.94f, -2.1f, -2.1f, -2.1f);
        s.curveToRelative(1.16f, 0.0f, 2.1f, -0.94f, 2.1f, -2.1f);
        s.verticalLineTo(8.0f);
        s.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(s, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _timer3Select = build;
        build.getClass();
        return build;
    }
}
