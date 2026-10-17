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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ExpandKt {
    private static ImageVector _expand;

    public static final ImageVector getExpand(Icons.Sharp sharp) {
        ImageVector imageVector = _expand;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Expand", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = gy.d(4.0f, 20.0f, 16.0f, 2.0f, 4.0f);
        k4.D(d, 20.0f, 4.0f, 2.0f, 16.0f);
        gy.s(d, 2.0f, 4.0f, 2.0f);
        d.moveTo(13.0f, 9.0f);
        d.horizontalLineToRelative(3.0f);
        d.lineToRelative(-4.0f, -4.0f);
        fc.w(d, 8.0f, 9.0f, 3.0f, 6.0f);
        d.horizontalLineTo(8.0f);
        d.lineToRelative(4.0f, 4.0f);
        d.lineToRelative(4.0f, -4.0f);
        d.horizontalLineToRelative(-3.0f);
        d.verticalLineTo(9.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _expand = build;
        build.getClass();
        return build;
    }
}
