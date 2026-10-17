package androidx.compose.material.icons.outlined;

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
import defpackage.fc;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EuroSymbolKt {
    private static ImageVector _euroSymbol;

    public static final ImageVector getEuroSymbol(Icons.Outlined outlined) {
        ImageVector imageVector = _euroSymbol;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.EuroSymbol", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(15.0f, 18.5f);
        b.curveToRelative(-2.51f, 0.0f, -4.68f, -1.42f, -5.76f, -3.5f);
        r6.y(b, 15.0f, -2.0f, 8.58f);
        b.curveToRelative(-0.05f, -0.33f, -0.08f, -0.66f, -0.08f, -1.0f);
        b.reflectiveCurveToRelative(0.03f, -0.67f, 0.08f, -1.0f);
        fc.q(b, 15.0f, 9.0f, 9.24f);
        b.curveTo(10.32f, 6.92f, 12.5f, 5.5f, 15.0f, 5.5f);
        b.curveToRelative(1.61f, 0.0f, 3.09f, 0.59f, 4.23f, 1.57f);
        b.lineTo(21.0f, 5.3f);
        b.curveTo(19.41f, 3.87f, 17.3f, 3.0f, 15.0f, 3.0f);
        b.curveToRelative(-3.92f, 0.0f, -7.24f, 2.51f, -8.48f, 6.0f);
        af0.u(b, 3.0f, 2.0f, 3.06f);
        b.curveToRelative(-0.04f, 0.33f, -0.06f, 0.66f, -0.06f, 1.0f);
        b.reflectiveCurveToRelative(0.02f, 0.67f, 0.06f, 1.0f);
        af0.u(b, 3.0f, 2.0f, 3.52f);
        b.curveToRelative(1.24f, 3.49f, 4.56f, 6.0f, 8.48f, 6.0f);
        b.curveToRelative(2.31f, 0.0f, 4.41f, -0.87f, 6.0f, -2.3f);
        b.lineToRelative(-1.78f, -1.77f);
        b.curveToRelative(-1.13f, 0.98f, -2.6f, 1.57f, -4.22f, 1.57f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _euroSymbol = build;
        build.getClass();
        return build;
    }
}
