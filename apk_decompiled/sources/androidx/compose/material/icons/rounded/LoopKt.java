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
import defpackage.gy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LoopKt {
    private static ImageVector _loop;

    public static final ImageVector getLoop(Icons.Rounded rounded) {
        ImageVector imageVector = _loop;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Loop", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(12.0f, 4.0f, 12.0f, 2.21f);
        i.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        i.lineToRelative(-2.8f, 2.79f);
        i.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        i.lineToRelative(2.79f, 2.79f);
        i.curveToRelative(0.32f, 0.31f, 0.86f, 0.09f, 0.86f, -0.36f);
        i.lineTo(12.0f, 6.0f);
        i.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        i.curveToRelative(0.0f, 0.79f, -0.15f, 1.56f, -0.44f, 2.25f);
        i.curveToRelative(-0.15f, 0.36f, -0.04f, 0.77f, 0.23f, 1.04f);
        i.curveToRelative(0.51f, 0.51f, 1.37f, 0.33f, 1.64f, -0.34f);
        i.curveToRelative(0.37f, -0.91f, 0.57f, -1.91f, 0.57f, -2.95f);
        i.curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
        i.close();
        i.moveTo(12.0f, 18.0f);
        i.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        i.curveToRelative(0.0f, -0.79f, 0.15f, -1.56f, 0.44f, -2.25f);
        i.curveToRelative(0.15f, -0.36f, 0.04f, -0.77f, -0.23f, -1.04f);
        i.curveToRelative(-0.51f, -0.51f, -1.37f, -0.33f, -1.64f, 0.34f);
        i.curveTo(4.2f, 9.96f, 4.0f, 10.96f, 4.0f, 12.0f);
        i.curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        i.verticalLineToRelative(1.79f);
        i.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        i.lineToRelative(2.79f, -2.79f);
        i.curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        i.lineToRelative(-2.79f, -2.79f);
        i.curveToRelative(-0.31f, -0.31f, -0.85f, -0.09f, -0.85f, 0.36f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(i, 12.0f, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _loop = build;
        build.getClass();
        return build;
    }
}
