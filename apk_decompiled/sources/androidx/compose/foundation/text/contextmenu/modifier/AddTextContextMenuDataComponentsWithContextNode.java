package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.ky;
import defpackage.my;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class AddTextContextMenuDataComponentsWithContextNode extends DelegatingNode implements CompositionLocalConsumerModifierNode {
    private my builder;

    public AddTextContextMenuDataComponentsWithContextNode(my myVar) {
        this.builder = myVar;
        delegate(new AddTextContextMenuDataComponentsNode(new ky() { // from class: androidx.compose.foundation.text.contextmenu.modifier.a
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 _init_$lambda$0;
                _init_$lambda$0 = AddTextContextMenuDataComponentsWithContextNode._init_$lambda$0(AddTextContextMenuDataComponentsWithContextNode.this, (TextContextMenuBuilderScope) obj);
                return _init_$lambda$0;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 _init_$lambda$0(AddTextContextMenuDataComponentsWithContextNode addTextContextMenuDataComponentsWithContextNode, TextContextMenuBuilderScope textContextMenuBuilderScope) {
        addTextContextMenuDataComponentsWithContextNode.builder.invoke(textContextMenuBuilderScope, CompositionLocalConsumerModifierNodeKt.currentValueOf(addTextContextMenuDataComponentsWithContextNode, AndroidCompositionLocals_androidKt.getLocalContext()));
        return w01.a;
    }

    public final my getBuilder() {
        return this.builder;
    }

    public final void setBuilder(my myVar) {
        this.builder = myVar;
    }
}
