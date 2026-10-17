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
import defpackage.bv;
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ViewListKt {
    private static ImageVector _viewList;

    public static final ImageVector getViewList(Icons.AutoMirrored.Sharp sharp) {
        ImageVector imageVector = _viewList;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Sharp.ViewList", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = gy.d(3.0f, 14.0f, 4.0f, -4.0f, 3.0f);
        k4.D(d, 14.0f, 3.0f, 19.0f, 4.0f);
        gy.s(d, -4.0f, 3.0f, 19.0f);
        j50.y(d, 3.0f, 9.0f, 4.0f, 5.0f);
        bv.s(d, 3.0f, 9.0f, 8.0f, 14.0f);
        gy.t(d, 13.0f, -4.0f, 8.0f, 14.0f);
        k4.C(d, 8.0f, 19.0f, 13.0f, -4.0f);
        bv.s(d, 8.0f, 19.0f, 8.0f, 5.0f);
        d.verticalLineToRelative(4.0f);
        d.horizontalLineToRelative(13.0f);
        d.verticalLineTo(5.0f);
        d.horizontalLineTo(8.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _viewList = build;
        build.getClass();
        return build;
    }
}
