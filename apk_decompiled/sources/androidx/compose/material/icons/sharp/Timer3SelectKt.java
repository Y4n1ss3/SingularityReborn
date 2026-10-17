package androidx.compose.material.icons.sharp;

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
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Timer3SelectKt {
    private static ImageVector _timer3Select;

    public static final ImageVector getTimer3Select(Icons.Sharp sharp) {
        ImageVector imageVector = _timer3Select;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Timer3Select", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(21.0f, 11.0f, 2.0f, -4.0f, 1.0f);
        af0.v(s, 4.0f, 5.0f, -6.0f, -2.0f);
        af0.v(s, 4.0f, -1.0f, -4.0f, -5.0f);
        kp0.D(s, 21.0f, 4.0f, 5.0f, 3.0f);
        af0.z(s, 6.0f, 2.5f, 4.0f, 3.0f);
        af0.p(s, 6.0f, 16.0f, 4.0f, 3.0f);
        s.horizontalLineToRelative(9.0f);
        s.verticalLineTo(5.0f);
        s.horizontalLineTo(4.0f);
        s.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, s.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _timer3Select = build;
        build.getClass();
        return build;
    }
}
