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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ArrowBackIosNewKt {
    private static ImageVector _arrowBackIosNew;

    public static final ImageVector getArrowBackIosNew(Icons.Rounded rounded) {
        ImageVector imageVector = _arrowBackIosNew;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ArrowBackIosNew", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(16.88f, 2.88f, 16.88f, 2.88f);
        i.curveToRelative(-0.49f, -0.49f, -1.28f, -0.49f, -1.77f, 0.0f);
        i.lineToRelative(-8.41f, 8.41f);
        i.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        i.lineToRelative(8.41f, 8.41f);
        i.curveToRelative(0.49f, 0.49f, 1.28f, 0.49f, 1.77f, 0.0f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveToRelative(0.49f, -0.49f, 0.49f, -1.28f, 0.0f, -1.77f);
        i.lineTo(9.54f, 12.0f);
        i.lineToRelative(7.35f, -7.35f);
        i.curveTo(17.37f, 4.16f, 17.37f, 3.37f, 16.88f, 2.88f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _arrowBackIosNew = build;
        build.getClass();
        return build;
    }
}
