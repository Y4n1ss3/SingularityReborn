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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SignalCellularAlt1BarKt {
    private static ImageVector _signalCellularAlt1Bar;

    public static final ImageVector getSignalCellularAlt1Bar(Icons.Rounded rounded) {
        ImageVector imageVector = _signalCellularAlt1Bar;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SignalCellularAlt1Bar", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(6.5f, 20.0f);
        b.curveTo(5.67f, 20.0f, 5.0f, 19.33f, 5.0f, 18.5f);
        b.verticalLineToRelative(-3.0f);
        b.curveTo(5.0f, 14.67f, 5.67f, 14.0f, 6.5f, 14.0f);
        b.reflectiveCurveTo(8.0f, 14.67f, 8.0f, 15.5f);
        b.verticalLineToRelative(3.0f);
        b.curveTo(8.0f, 19.33f, 7.33f, 20.0f, 6.5f, 20.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _signalCellularAlt1Bar = build;
        build.getClass();
        return build;
    }
}
