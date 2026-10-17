package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import defpackage.er0;
import defpackage.ky;
import defpackage.mb0;
import defpackage.o;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextContextMenuModifierKt {
    private static final boolean continueTraversal = true;
    private static final String wrongNodeTypeErrorMessage = "TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.";

    public static final Modifier appendTextContextMenuComponents(Modifier modifier, ky kyVar) {
        return modifier.then(new AddTextContextMenuDataComponentsElement(kyVar));
    }

    public static final TextContextMenuData collectTextContextMenuData(DelegatableNode delegatableNode) {
        TextContextMenuBuilderScope textContextMenuBuilderScope = new TextContextMenuBuilderScope();
        traverseTextContextMenuDataNodes(delegatableNode, new TextContextMenuModifierKt$collectTextContextMenuData$1$1(textContextMenuBuilderScope), new mb0(textContextMenuBuilderScope, 29));
        return textContextMenuBuilderScope.build$foundation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 collectTextContextMenuData$lambda$0$0(TextContextMenuBuilderScope textContextMenuBuilderScope, ky kyVar) {
        kyVar.invoke(textContextMenuBuilderScope);
        return w01.a;
    }

    public static final Modifier filterTextContextMenuComponents(Modifier modifier, ky kyVar) {
        return modifier.then(new FilterTextContextMenuDataComponentsElement(kyVar));
    }

    private static final void traverseTextContextMenuDataNodes(DelegatableNode delegatableNode, ky kyVar, ky kyVar2) {
        TraversableNodeKt.traverseAncestors(delegatableNode, TextContextMenuDataTraverseKey.INSTANCE, new er0(3, kyVar2, kyVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean traverseTextContextMenuDataNodes$lambda$0(ky kyVar, ky kyVar2, TraversableNode traversableNode) {
        if (traversableNode instanceof AddTextContextMenuDataComponentsNode) {
            kyVar.invoke(((AddTextContextMenuDataComponentsNode) traversableNode).getBuilder());
            return true;
        }
        if (traversableNode instanceof FilterTextContextMenuDataComponentsNode) {
            kyVar2.invoke(((FilterTextContextMenuDataComponentsNode) traversableNode).getFilter());
            return true;
        }
        o.f(wrongNodeTypeErrorMessage);
        return false;
    }
}
