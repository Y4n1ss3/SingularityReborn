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
import defpackage.c21;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BatchPredictionKt {
    private static ImageVector _batchPrediction;

    public static final ImageVector getBatchPrediction(Icons.Sharp sharp) {
        ImageVector imageVector = _batchPrediction;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.BatchPrediction", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(19.0f, 8.0f, 5.0f, 14.0f, 14.0f);
        k4.D(i, 8.0f, 13.0f, 20.5f, -2.0f);
        c21.c(i, 19.0f, 2.0f, 20.5f);
        i.moveTo(13.0f, 18.0f);
        i.horizontalLineToRelative(-2.0f);
        i.curveToRelative(0.0f, -1.5f, -2.5f, -3.0f, -2.5f, -5.0f);
        i.curveToRelative(0.0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f);
        i.curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f);
        i.curveTo(15.5f, 15.0f, 13.0f, 16.5f, 13.0f, 18.0f);
        c21.d(i, 18.0f, 6.5f, 6.0f, 5.0f);
        uo.r(i, 12.0f, 6.5f, 17.0f, 3.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kp0.o(i, 7.0f, 2.0f, 10.0f, 3.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _batchPrediction = build;
        build.getClass();
        return build;
    }
}
