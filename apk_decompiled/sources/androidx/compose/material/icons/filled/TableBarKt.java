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
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TableBarKt {
    private static ImageVector _tableBar;

    public static final ImageVector getTableBar(Icons.Filled filled) {
        ImageVector imageVector = _tableBar;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.TableBar", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(22.0f, 7.5f);
        b.curveTo(22.0f, 5.57f, 17.52f, 4.0f, 12.0f, 4.0f);
        b.reflectiveCurveTo(2.0f, 5.57f, 2.0f, 7.5f);
        b.curveToRelative(0.0f, 1.81f, 3.95f, 3.31f, 9.0f, 3.48f);
        b.verticalLineTo(15.0f);
        b.horizontalLineTo(9.35f);
        b.curveToRelative(-0.82f, 0.0f, -1.55f, 0.5f, -1.86f, 1.26f);
        b.lineTo(6.0f, 20.0f);
        kf0.B(b, 2.0f, 1.2f, -3.0f, 5.6f);
        b.lineToRelative(1.2f, 3.0f);
        b.horizontalLineToRelative(2.0f);
        b.lineToRelative(-1.5f, -3.74f);
        b.curveTo(16.2f, 15.5f, 15.46f, 15.0f, 14.65f, 15.0f);
        b.horizontalLineTo(13.0f);
        b.verticalLineToRelative(-4.02f);
        b.curveTo(18.05f, 10.81f, 22.0f, 9.31f, 22.0f, 7.5f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tableBar = build;
        build.getClass();
        return build;
    }
}
