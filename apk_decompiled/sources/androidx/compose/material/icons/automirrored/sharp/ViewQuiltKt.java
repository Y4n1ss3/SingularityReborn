package androidx.compose.material.icons.automirrored.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.kf0;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ViewQuiltKt {
    private static ImageVector _viewQuilt;

    public static final ImageVector getViewQuilt(Icons.AutoMirrored.Sharp sharp) {
        ImageVector imageVector = _viewQuilt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Sharp.ViewQuilt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder y = kp0.y(21.0f, 5.0f, 6.5f, 9.33f, 5.0f);
        kp0.D(y, 21.0f, 14.67f, 19.0f, -6.5f);
        kp0.p(y, 9.33f, 19.0f, 14.67f);
        kp0.C(y, 15.67f, 12.5f, 19.0f, 21.0f);
        kf0.n(y, -6.5f, 15.67f, 8.33f, 19.0f);
        y.verticalLineTo(5.0f);
        y.horizontalLineTo(3.0f);
        y.verticalLineToRelative(14.0f);
        y.horizontalLineTo(8.33f);
        y.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, y.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _viewQuilt = build;
        build.getClass();
        return build;
    }
}
