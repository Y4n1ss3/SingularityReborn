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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LoopKt {
    private static ImageVector _loop;

    public static final ImageVector getLoop(Icons.Filled filled) {
        ImageVector imageVector = _loop;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Loop", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(12.0f, 4.0f, 12.0f, 1.0f);
        i.lineTo(8.0f, 5.0f);
        i.lineToRelative(4.0f, 4.0f);
        i.lineTo(12.0f, 6.0f);
        i.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        i.curveToRelative(0.0f, 1.01f, -0.25f, 1.97f, -0.7f, 2.8f);
        i.lineToRelative(1.46f, 1.46f);
        i.curveTo(19.54f, 15.03f, 20.0f, 13.57f, 20.0f, 12.0f);
        i.curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
        i.close();
        i.moveTo(12.0f, 18.0f);
        i.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        i.curveToRelative(0.0f, -1.01f, 0.25f, -1.97f, 0.7f, -2.8f);
        i.lineTo(5.24f, 7.74f);
        i.curveTo(4.46f, 8.97f, 4.0f, 10.43f, 4.0f, 12.0f);
        i.curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        i.verticalLineToRelative(3.0f);
        i.lineToRelative(4.0f, -4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.n(i, -4.0f, -4.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _loop = build;
        build.getClass();
        return build;
    }
}
