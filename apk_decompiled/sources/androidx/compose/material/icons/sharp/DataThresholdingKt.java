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
import defpackage.bv;
import defpackage.gy;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DataThresholdingKt {
    private static ImageVector _dataThresholding;

    public static final ImageVector getDataThresholding(Icons.Sharp sharp) {
        ImageVector imageVector = _dataThresholding;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DataThresholding", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(21.0f, 3.0f, 3.0f, 18.0f, 18.0f);
        bv.t(i, 3.0f, 10.67f, 8.17f);
        i.lineToRelative(2.0f, 2.0f);
        i.lineToRelative(3.67f, -3.67f);
        i.lineToRelative(1.41f, 1.41f);
        i.lineTo(12.67f, 13.0f);
        i.lineToRelative(-2.0f, -2.0f);
        i.lineToRelative(-3.0f, 3.0f);
        gy.B(i, -1.41f, -1.41f, 10.67f, 8.17f);
        i.moveTo(5.0f, 16.0f);
        i.horizontalLineToRelative(1.72f);
        i.lineTo(5.0f, 17.72f);
        i.verticalLineTo(16.0f);
        i.close();
        i.moveTo(5.84f, 19.0f);
        i.lineToRelative(3.0f, -3.0f);
        uf.A(i, 1.83f, -3.0f, 3.0f, 5.84f);
        i.moveTo(9.8f, 19.0f);
        i.lineToRelative(3.0f, -3.0f);
        uf.A(i, 1.62f, -3.0f, 3.0f, 9.8f);
        i.moveTo(13.53f, 19.0f);
        i.lineToRelative(3.0f, -3.0f);
        uf.A(i, 1.62f, -3.0f, 3.0f, 13.53f);
        i.moveTo(19.0f, 19.0f);
        i.horizontalLineToRelative(-1.73f);
        i.lineTo(19.0f, 17.27f);
        i.verticalLineTo(19.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dataThresholding = build;
        build.getClass();
        return build;
    }
}
