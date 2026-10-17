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
import defpackage.fc;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DraftsKt {
    private static ImageVector _drafts;

    public static final ImageVector getDrafts(Icons.Rounded rounded) {
        ImageVector imageVector = _drafts;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Drafts", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(21.99f, 8.0f);
        b.curveToRelative(0.0f, -0.72f, -0.37f, -1.35f, -0.94f, -1.7f);
        b.lineToRelative(-8.04f, -4.71f);
        b.curveToRelative(-0.62f, -0.37f, -1.4f, -0.37f, -2.02f, 0.0f);
        b.lineTo(2.95f, 6.3f);
        b.curveTo(2.38f, 6.65f, 2.0f, 7.28f, 2.0f, 8.0f);
        b.verticalLineToRelative(10.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(16.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        fc.B(b, -0.01f, -10.0f, 10.94f, 12.34f);
        b.lineToRelative(-7.2f, -4.5f);
        b.lineToRelative(7.25f, -4.25f);
        b.curveToRelative(0.62f, -0.37f, 1.4f, -0.37f, 2.02f, 0.0f);
        b.lineToRelative(7.25f, 4.25f);
        b.lineToRelative(-7.2f, 4.5f);
        b.curveToRelative(-0.65f, 0.4f, -1.47f, 0.4f, -2.12f, 0.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _drafts = build;
        build.getClass();
        return build;
    }
}
