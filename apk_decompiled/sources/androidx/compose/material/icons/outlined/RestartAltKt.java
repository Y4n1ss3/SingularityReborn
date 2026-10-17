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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RestartAltKt {
    private static ImageVector _restartAlt;

    public static final ImageVector getRestartAlt(Icons.Outlined outlined) {
        ImageVector imageVector = _restartAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.RestartAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(6.0f, 13.0f);
        b.curveToRelative(0.0f, -1.65f, 0.67f, -3.15f, 1.76f, -4.24f);
        b.lineTo(6.34f, 7.34f);
        b.curveTo(4.9f, 8.79f, 4.0f, 10.79f, 4.0f, 13.0f);
        b.curveToRelative(0.0f, 4.08f, 3.05f, 7.44f, 7.0f, 7.93f);
        b.verticalLineToRelative(-2.02f);
        b.curveTo(8.17f, 18.43f, 6.0f, 15.97f, 6.0f, 13.0f);
        b.close();
        b.moveTo(20.0f, 13.0f);
        b.curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
        b.curveToRelative(-0.06f, 0.0f, -0.12f, 0.01f, -0.18f, 0.01f);
        b.lineToRelative(1.09f, -1.09f);
        b.lineTo(11.5f, 2.5f);
        b.lineTo(8.0f, 6.0f);
        b.lineToRelative(3.5f, 3.5f);
        b.lineToRelative(1.41f, -1.41f);
        b.lineToRelative(-1.08f, -1.08f);
        b.curveTo(11.89f, 7.01f, 11.95f, 7.0f, 12.0f, 7.0f);
        b.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        b.curveToRelative(0.0f, 2.97f, -2.17f, 5.43f, -5.0f, 5.91f);
        b.verticalLineToRelative(2.02f);
        b.curveTo(16.95f, 20.44f, 20.0f, 17.08f, 20.0f, 13.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _restartAlt = build;
        build.getClass();
        return build;
    }
}
