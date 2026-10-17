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
import defpackage.er;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ArrowForwardIosKt {
    private static ImageVector _arrowForwardIos;

    public static final ImageVector getArrowForwardIos(Icons.Rounded rounded) {
        ImageVector imageVector = _arrowForwardIos;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ArrowForwardIos", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(7.38f, 21.01f);
        b.curveToRelative(0.49f, 0.49f, 1.28f, 0.49f, 1.77f, 0.0f);
        b.lineToRelative(8.31f, -8.31f);
        b.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        b.lineTo(9.15f, 2.98f);
        b.curveToRelative(-0.49f, -0.49f, -1.28f, -0.49f, -1.77f, 0.0f);
        b.reflectiveCurveToRelative(-0.49f, 1.28f, 0.0f, 1.77f);
        b.lineTo(14.62f, 12.0f);
        b.lineToRelative(-7.25f, 7.25f);
        b.curveToRelative(-0.48f, 0.48f, -0.48f, 1.28f, 0.01f, 1.76f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _arrowForwardIos = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getArrowForwardIos$annotations(Icons.Rounded rounded) {
    }
}
